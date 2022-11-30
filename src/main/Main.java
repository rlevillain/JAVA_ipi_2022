package main;

import java.util.Scanner;

//Ensemble de méthode

import main.beans.DiceBean;
import main.beans.SubmarineBean;

public class Main {
    //Ensemble d'instruction
    public static void main(String[] args) {
        //exo1()
        //crepes(10)
        //crepes(42)
        //crepesInteractive();
        //boulanderieInteractive();
        //minuteToSecond();
        DiceBean de = new DiceBean();
        de.setValue(2);
        System.out.println(de.getValue());
        de.roll();
        System.out.println(de.getValue());


    }

    public static void exo1() {
        int i = 7;
        int j = 3;
        int divEnt = i / j;
        var l = 2;
        var m = 5;
        var div = (double) i / (double) j;
        System.out.println("divEnt=" + divEnt);
        System.out.println("reste=" + i % j);
        System.out.println("division=" + div);
        System.out.println("somme=" + (j + div));
        System.out.println("somme=" + (m / l));
    }

    public static void crepes(int value) {
        System.out.println("Pour " + value + " crêpes il faut : \n - " + (20 * value) + "g de farine \n - "
                + (value / 5) + " oeuf(s)");
    }

    public static void crepesInteractive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de crêpes voulez vous préparer ?");
        int nombre = scanner.nextInt();
        crepes(nombre);
    }

    public static void boulangerie(int nbCroissant, int nbBaguette) {
        System.out.println("Prix : " + ((nbCroissant * 1.1) + (nbBaguette * 0.9)) + "€");

    }

    public static void boulanderieInteractive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de croissants voulez vous ?");
        int croissants = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Combien de baguettes voulez vous ?");
        int baguettes = scanner.nextInt();
        boulangerie(croissants, baguettes);

    }

    public static int minuteToSecond(int min) {
        return (min * 60);
    }

    public static int hourToMinute(int hour) {
        return (hour * 60);
    }

    public static int hourAndMinuteToSecond(int hour, int minutes) {
        return (((hour * 60) + minutes) * 60);
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }
        else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    DiceBean de = new DiceBean();

}


