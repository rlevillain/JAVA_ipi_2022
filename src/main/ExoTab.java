package main;

import java.util.Arrays;
import java.util.Random;

public class ExoTab {
    public static void main(String[] args) {
        /*int[] tab = new int[]{2,5,8,12,20};
        int[] tab3 = new int[]{852,58,88,125,20};
        System.out.println(tab[4]);
        tab[2] = 12;
        int taille = tab.length;
        System.out.println(taille);
        for (int i = 0; i< taille; i++){
            System.out.println(i + " : " + tab[i]);
        }
        for (int i = 0; i< taille; i++){
            tab[i] = tab[i]+1;
        }
        System.out.println(Arrays.toString(tab));
        for (int i = 1; i< taille; i++){
            tab[i] = tab[i-1]+1;
        }

        System.out.println(Arrays.toString(tab));
        int a = 4;
        int[] tab2 = new int[]{1,23,4,6};
        add1(tab2, a);
        System.out.println(Arrays.toString(tab2));
        System.out.println(a);*/
        // ____________________________________________TESTS


        int[] tabtest1 = new int[50];
        int[] tabtest2 = new int[50];
        fillTab(tabtest1);
        fillTab(tabtest2);
        System.out.println(Arrays.toString(tabtest1));
        //System.out.   println(Arrays.toString(fusionTrier(tabtest1,tabtest2)));


    }
    public static void add1(int[] tab, int n) {
        int len = tab.length;
        for (int i = 0; i< len; i++){
            tab[i] = tab[i]+1;
        }

    }
    public static void fillTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
            }
        }
    public static void printTab(int[] tab) {
        String res = "";
        for (int i = 0; i < tab.length; i++) {
            res += tab[i]+" ";
            }
        System.out.println(res);
        }
    public static int getMax(int[] tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                 max = tab[i];
                }

            }
        return max;
        }
    public static void permute(int[] tab, int i, int j) {
        int a = tab[i];
        int b = tab[j];
        tab[i] = b;
        tab[j] = a;
    }
    public static int sum(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
    return sum;
    }
    public static double average(int[] tab) {
        int s = sum(tab);
        return (double) s/tab.length;
    }
    public static void supAverage(int[] tab){
        double a = average(tab);
        String res = "";
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > a){
                res += tab[i] + " ";}
            }
            System.out.println(res);
    }
    public static int nbMax(int[] tab){
        int max = getMax(tab);
        int cpt = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] == max){ cpt++;}
        }
        return cpt;
        }
    public static int[] fusion(int[] tab1, int[] tab2){
        int l1 = tab1.length;
        int l2 = tab2.length;
        int[] tab = new int[l1+l2];
        for (int i=0; i<l1; i++){
            tab[i] = tab1[i];
        }
        for (int i=l1; i<l1+l2; i++){
            tab[i] = tab2[i-l1];
        }
        return tab;

    }
    public static boolean isSorted(int[] tab){
        for (int i =1; i < tab.length; i++)
            if (tab[i] < tab[i-1]){
                return false;
                }
        return true;
    }
    public static void sortTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length- i; j++) {
                if (tab[j] < tab[j - 1]) {
                    permute(tab, j, j - 1);
                }
            }
        }
    }
    public static int[] fusionTrier(int[] sortTab1, int[] sortTab2) {
        //3eme tableau de la taille de T1 +t2
        int[] t3 = new int[sortTab1.length + sortTab2.length];

        //J'ai besoin de 3 indices, pour définir ou j'en suis dans la lecture de t1 et T2 et le remplissage de t3
        //J'iétère sur T3
        for (int it1 = 0, it2 = 0, it3 = 0; it3 < t3.length; it3++) {
            //S'il n'y a plus d'élément de T1 à mettre je mets ceux de T2 (et vice versa)
            if (it1 >= sortTab1.length) {
                t3[it3] = sortTab2[it2];
                it2++;//J'avance ma lecture de t2
            } else if (it2 >= sortTab2.length) {
                t3[it3] = sortTab1[it1];
                it1++;//J'avance ma lecture de t1
            }
            //Il reste des éléments des 2 tableaux je mets le plus petit des 2
            else if (sortTab1[it1] <= sortTab2[it2]) {
                t3[it3] = sortTab1[it1];
                it1++;//J'avance ma lecture de t1
            }
            //
            else {
                t3[it3] = sortTab2[it2];
                it2++;//J'avance ma lecture de t2
            }
        }
        return t3;
    }
    public static void flags(int[] tab) {
        //i0 indice ou on positionnera le prochain 0
        //i2 indice ou on positionnera le prochain 2
        //i le parcours du tableau. On s'arrête quand on dépasse i2 car toutes les valeurs suivantes sont des 2
        for (int i0 = 0, i2 = tab.length - 1, i = 0; i <= i2; ) {
            if (tab[i] == 0) {
                //On permutte et on incrémente i et i0
                tab[i] = tab[i0];
                tab[i0] = 0;
                i++;
                i0++;
            } else if (tab[i] == 1) {
                //Rien à faire
                i++;
            } else {
                //Si c'est un 2 on permute et on n'incrémente pas i, car la valeur n'a pas encore été lue
                tab[i] = tab[i2];
                tab[i2] = 2;
                i2--;
            }
        }
    }


}



