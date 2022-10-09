package com.bridgelabz.StarPattern;

public class StarPattrn {
    public static void main(String[] args) {
        System.out.println("Simple star pattern......");
        simpleStarPattern();

        System.out.println();

        System.out.println("Reverce Simple star pattern......");
        revercesimpleStarPattern();

        System.out.println();

        System.out.println("Square Star pattern.....");
        squareStarPattern();

        System.out.println();

        System.out.println("Triangle Star Pattern.....");
        triangleStarPattern();

        System.out.println();

        System.out.println("Reverce Triangle Star Pattern.....");
        revercetriangleStarPattern();

        System.out.println();

        System.out.println("Number Pattern.....");
        numberPattrn();

        System.out.println();

        System.out.println("Character Pattern......");
        charPattern();

        System.out.println();

        System.out.println("Diamond Star Pattern.....");
        dimandStarPattern();

        System.out.println();

        System.out.println("Half Diamond Star Pattern.....");
        halfDiamondStarPattern();


    }

    static void simpleStarPattern() {
        for (int i = 1; i <= 5; i++) {  //row
            for (int j = 1; j <= i; j++) {  //colom
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    static void revercesimpleStarPattern() {
        for (int i = 5; i >= 1; i--) {  //row
            for (int j = 1; j <= i; j++) {  //colom
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void squareStarPattern() {
        for (int i = 1; i <= 5; i++) {  //row
            for (int j = 1; j <= 5; j++) {  //colom
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }


    static void triangleStarPattern() {
        for (int i = 1; i <= 5; i++) {  //rows
            for (int j = 5; j > i; j--) {   //space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     //coloms
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    static void revercetriangleStarPattern() {
        for (int i = 5; i >= 1; i--) {  //rows
            for (int j = 5; j > i; j--) {   //space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     //coloms
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void numberPattrn() {
        for (int i = 1; i <= 5; i++) {  //row
            for (int j = 1; j <= i; j++) {  //colom
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    static void charPattern() {
        for (char i = 'A'; i <= 'E'; i++) {  //row
            for (char j = 'A'; j <= i; j++) {  //colom
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }


    static void dimandStarPattern() {
        for (int i = 1; i <= 5; i++) {  //rows
            for (int j = 5; j > i; j--) {   //space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     //coloms
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 5; i >= 1; i--) { //rows
            for (int j = 5; j > i; j--) { //space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }


    static void halfDiamondStarPattern() {
        for (int i = 1; i <= 5; i++) {  //row
            for (int j = 1; j <= i; j++) {  //colom
                System.out.print("*");
            }
            System.out.print("\n");

        }
        for (int i = 5; i >= 1; i--) {  //row
            for (int j = 1; j <= i; j++) {  //colom
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
