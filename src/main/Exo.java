package main;

import java.security.spec.ECField;

public class Exo {
    public static void main(String[] args) {
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public static boolean testIf1(int x) {
        if ((x >= -2 && x <= 5) || (x >= 15 && x < 27)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf2(int x) {
        if ((x >= 5 && x <= 25) || (x >= 12 && x < 48)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf3(int x) {
        if (x >= -5) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf4(int x) {
        if ((x >= 60) || (x >=2 && x <=18) || (x == 40) || (x == 50)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf5(int x) {
        if ((x >= 60) || (x >=2 && x <=18) || (x == 50)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf6(int x) {
        if (x != 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf7(int x) {
        if ((x <= 25) || (x >=-4 && x <40) || (x >= 30 && x <125) || (x >= 80)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean testIf8(int x) {
        if ((x <= 0) || (x >=0)){
            return true;
        } else {
            return false;
        }
    }
    public static char charAt3(String chaine) {
        if (chaine.length() >= 3) {
            return chaine.charAt(2);
        }
        else {
            return '?';
        }
    }

}






