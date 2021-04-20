package com.company;

public class Main {

    public static void main(String[] args) {

	    Insect defaultInsect = new Insect();
        System.out.println(defaultInsect);

        Insect shortInsect = new Insect("short insect", 10, 20, "red");
        System.out.println(shortInsect);

        Insect butterflyInsect = new Insect("butterfly", 100, 300, "rainbow", "idk",
                "big", 1);
        System.out.println(butterflyInsect);

        System.out.println("Printing static counter with static method");
        Insect.printStaticCounter();

        System.out.println("\nPrinting static counter");
        butterflyInsect.printCounter();
    }
}
