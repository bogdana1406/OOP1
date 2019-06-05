package com.javalesson.exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandlingMain {
    public static void main(String[] args) {


        try {
            doEverything();
        } catch (InvalidInputParamExeption e) {
            System.out.println("InvalidInputParamExeption");
            e.printStackTrace();
        }
//

    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"))) {
                System.out.println("Please, enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please, enter denominator");
                int denominator = scanner.nextInt();
//                int[] intArray = new int[1];
//                int i = intArray[2];
//                writer = new PrintWriter(new FileWriter("out.txt"));
//                writer.println("Result = " + divine(numerator, denominator));
//                saveToFile(divine(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: "+ e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All exceptions are hear");
                throw new InvalidInputParamExeption("Index out of bound "+e);
            } finally {
                System.out.println("Finally block called");
//                if (writer != null) {
//                    writer.close();
//                }

            }
            System.out.println(" Try catch block finished");
        } while (continueLoop);
    }


    private static int divine(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

//    private static void saveToFile(int result) throws IOException {
//        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
//        writer.println("Result = "+result);
//        writer.close();
//    }

}
