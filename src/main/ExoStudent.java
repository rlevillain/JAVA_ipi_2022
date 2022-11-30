package main;

import main.beans.HouseBean;
import main.beans.StudentBean;

import java.util.UUID;
import java.util.Random;

public class ExoStudent {
    public static void main(String[] args) {
        StudentBean[] tab = new StudentBean[10];
        createStudents(tab);
    }

    public static void printStudent(StudentBean e) {
        try {
            System.out.println(e.name + ":" + e.note);
        } catch (NullPointerException ee) {
            System.out.println("Null");
        }
    }
    public static String getRandomName(){
        String[] name = new String[] {"Toto", "Tata", "Titi", "Bob", "Alfred"};
        return name[new Random().nextInt(name.length)];
    }

    public static void doubleNote(StudentBean e) {
        try {
            if (e.note * 2 < 20) {
                e.note *= 2;
            } else {
                e.note = 20;
            }
            ;
        } catch (NullPointerException ee) {
            System.out.println("Null");
        }

    }

    public static StudentBean bestStudent(StudentBean e1, StudentBean e2) {

        try {
            if (e1.note > e2.note) {
                return e1;
            } else if (e1.note == e2.note) {
                return null;
            } else {
                return e2;
            }
        } catch (NullPointerException ee) {
            if (e1 == null && e2 == null) {
                return null;
            } else if (e1 == null) {
                return e2;
            } else {
                return e1;
            }
        }
    }

    public static void createStudents(StudentBean[] tab) {
        try {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = new StudentBean();
                tab[i].name = getRandomName();
                tab[i].note = new Random().nextInt(20);

            }
        } catch (NullPointerException e) {
            System.out.println("null");
        }

    }

    public static void printStudents(StudentBean[] tab) {
        try {
            for (StudentBean eleve : tab) {
                try {
                    System.out.println(eleve.name + ":" + eleve.note);

                } catch (NullPointerException e) {
                    System.out.println("null");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("null");
        }


    }
    public static StudentBean bestBob(StudentBean[] tab){
        try {
            int max = 0;
            StudentBean maxbob = new StudentBean();

            for (int i = 0; i < tab.length; i++) {
                try {
                    if ((tab[i].note) > max && tab[i].name.equals("Bob")) {
                        maxbob = tab[i];
                        max = tab[i].note;

                    }
                }
                catch(NullPointerException e){}

            }
            if (maxbob.name == null & maxbob.note == 0){return null;}
            else {return maxbob;}

        }

        catch(NullPointerException e) {

            return null;
        }

    }

}
