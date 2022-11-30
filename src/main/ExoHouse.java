package main;


import main.beans.HouseBean;

import java.util.Random;

import static java.lang.Math.random;

public class ExoHouse {
    public static void main(String[] args) {
/*        HouseBean myHouse = new HouseBean();
        myHouse.length = 12;
        myHouse.width = 25;
        HouseBean m1 = new HouseBean();
        HouseBean m2 = new HouseBean();
        m1.length = 12;
        m1.width = 25;
        m2.length = 12;
        m2.width = 25;

        System.out.println((char) 64 );*/
        testTab();
    //exo1();
    }

    public static void exo1(){
        HouseBean m = null ;
        System.out.println(m);
        m = new HouseBean();
        System.out.println(m);
        m.setWidth(5);
        System.out.println(m.getWidth());
        HouseBean m2 = m;
        System.out.println(m2 + " " + m2.getWidth());
        m2.setWidth(10);
        System.out.println(m.getWidth() + " " + m2.getWidth());

    }
    public static void printHouse(HouseBean m){
        try {
            System.out.println(m.getWidth() + "x" + m.getLength());
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }

    };
    public static void doubleHouse(HouseBean m){
        try {
            m.setLength( 2*m.getLength());
            m.setWidth(2*m.getWidth());
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }

    };
    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {
        try {
            if ((m1.getWidth() * m1.getLength()) > ((m2.getLength()) * (m2.getWidth()))) {
                return m1;
            } else if ((m1.getLength() * m1.getWidth()) == ((m2.getLength()) * (m2.getWidth()))) {
                return null;
            }
            else {
                return m2;
            }
        } catch (NullPointerException e) {
            if (m1 != null){ return m1;}
            else if (m2 != null) {return m2;}
            else {return null;}
        }
    }
    public static void testTab(){
        HouseBean[] maison = new HouseBean[5];
        System.out.println(maison[3]);
        HouseBean m1 = new HouseBean();
        m1.setWidth(10);
        maison[0] = m1;
        maison[1] = m1;
        maison[2] = m1;
        System.out.println(maison[0].getWidth() +" " +maison[1].getWidth() +" " +maison[2].getWidth() );
        maison[0].setWidth(20);
        System.out.println(maison[0].getWidth() +" " +maison[1].getWidth() +" " +maison[2].getWidth() );
        //System.out.println(maison[3].width );

    }
    public static void createHouses(HouseBean[] tab) {
        try {
            for (int i=0; i<tab.length; i++){
                tab[i] = new HouseBean();
                tab[i].setWidth(new Random().nextInt(100));
                tab[i].setLength(new Random().nextInt(100));

            }
        }
        catch(NullPointerException e) {
            System.out.println("null");
        }

    }
    public static void printHouses (HouseBean[] tab) {
        try {
            for (HouseBean m : tab) {
                try {
                    System.out.println(m.getWidth() + "x" + m.getLength());
                }
                catch(NullPointerException e) {
                    System.out.println("null");
                }
            }
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }


        }

    public static HouseBean bigHouses(HouseBean[] tab) {
        try {
            int max = 0;
            HouseBean maxHouse = new HouseBean();
            for (int i = 0; i < tab.length; i++) {
                try {
                    if ((tab[i].getWidth() * tab[i].getLength()) > max) {
                        maxHouse = tab[i];
                        max = tab[i].getWidth() * tab[i].getLength();

                    }
                }
                catch(NullPointerException e){}

                }
            if (maxHouse.getLength() ==0 & maxHouse.getWidth() == 0){return null;}
                else {return maxHouse;}

            }

        catch(NullPointerException e) {

            return null;
        }

    }
    public static int getArea(HouseBean m) {
        if (m != null) {
            return (m.getWidth() * m.getLength());
        }

        else {return 0;}
    }
}


