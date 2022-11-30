package main;

import static java.lang.Character.isUpperCase;

public class ExoFor {
    public static void main(String[] args) {
    //testFor();
    //fibo();


    }

    public static void testFor() {
        String output = "";
        for (int i = 0; i<=10; i++) {
            output += i ;
            output += " ";

        }
        System.out.println(output);
        output = "";
        for (int i = 5; i<=12; i++) {
            output += i ;
            output += " ";

        }
        System.out.println(output);
        output = "";
        for (int i = 4; i<=48; i++) {
            if (i%2 == 0) {
                output += i;
                output += " ";
            }

        }
        System.out.println(output);
        output = "";
        for (int i = 10; i>=0; i = (i-1)) {
            output += i;
            output += " ";

        }
        System.out.println(output);
        output = "";
        for (int i = 0; i<=10; i++) {
            output += i;
            output += " ";
            output += i;
            output += " ";

        }
        System.out.println(output);
        output = "";
        for (int i = 0; i<=20; i++) {
            if (i%2 ==0) {
                output += i;
                output += " ";
            }
            else {output += i;
                output += " ";
                output += i;
                output += " ";}


        }
        System.out.println(output);
        output = "";
        for (int i = 0; i<=10; i++) {
            for (int j = 0; j<30; j++){
                output+= i;
                output+= " ";
            }
        }
        System.out.println(output);
    }
    public static void fibo(){
        int res = 1;
        int resprec = 1;
        int newres = 0;
        String output = "" + resprec + " " ;
        while (res <= 987 ) {
            newres = res;
            output = output + newres + " ";
            res = newres + resprec;
            resprec = newres;
        }
        System.out.println(output);



    }

    public static String withoutE(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = 0; i< len; i++){
            if ( phrase.charAt(i) != 'E' && phrase.charAt(i) != 'e' ){
                res += phrase.charAt(i);
            }
        }
        return res;
    }
    public static int nbA(String phrase){
        int len = phrase.length();
        String res = "";
        int cpt = 0;
        for (int i = 0; i< len; i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A')
            cpt++;
        }
        return cpt;
    }
    public static String reverse(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = (len - 1); i >= 0; i = i-1 ) {
            res += phrase.charAt(i);
        }
        return res;
    }
    public static int nbUppercase(String phrase) {
        int len = phrase.length();
        int cpt = 0;
        for (int i = 0; i < len; i++) {
            if (isUpperCase(phrase.charAt(i))) {
                cpt++;
            }
        }
            return cpt;

    }
    public static String withoutVowel(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            if ( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c!='y' ){
                res += phrase.charAt(i);
            }
        }
        return res;
    }
    public static String withoutUpp(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            if ( isUpperCase(c) == false ){
                res += phrase.charAt(i);
            }
        }
        return res;
    }
    public static char maxLetter(String phrase){
        int len = phrase.length();
        String res = "";
        int max = 0;
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            if ( (int) c > max ){
                max = (int) c;

            }
        }
        return (char) max ;
    }
    public static String spaceTo_(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            if ( c ==' ' ){
                res += '_';
            }
            else {
                res += c;
            }
        }
        return res ;
    }
    public static String trimStart(String phrase){
        int len = phrase.length();
        String res = "";
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            if ( c ==' ' && res.length() == 0 ){
                res += "";
            }
            else {
                res += c;
            }
        }
        return res ;
    }
    public static String trim(String phrase){
        String res = trimStart(phrase);
        res = reverse(res);
        res = trimStart(res);
        return reverse(res);
    }
    public static boolean isPalindrome(String phrase){
        String pal = "" ;
        String res = trimStart(phrase);
        res = reverse(res);
        res = trimStart(res);
        res = reverse(res);
        pal = reverse(res);
        if (pal.equals(res)) {
            return true;
    }
        else {
            return false;
        }
}
    public static char asciiAverage(String phrase){
        int len = phrase.length();
        String res = "";
        int sum = 0;
        int moy = 0;
        for (int i = 0; i< len; i++){
            char c = phrase.charAt(i);
            sum += (int) c;
            }
        moy = sum / len;
        return (char) moy ;
        }

    }
