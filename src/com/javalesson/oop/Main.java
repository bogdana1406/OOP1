package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();
        System.out.println("Dogs's count: " + Dog.getDogsCount());

        Dog lab = new Dog();

        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();

        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();

        doberman.setName("Roy");
        doberman.setBreed("doberman");
        doberman.setSize(Size.BIG);
        doberman.bite();


        Size s = Size.SMALL;

        Size s1 = Size.valueOf("BIG");

        Size[] values = Size.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }
}
