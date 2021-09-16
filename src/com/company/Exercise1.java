package com.company;

public class Exercise1 {

    public static int banana(int[] a) {                       //Denne metode giver os int "kiwi" og int "i", og et loop der siger at når "i" er mindre end længden
        int kiwi = 1;   //int "kiwi" bliver givet værdien 1   //af "a" skal den gange kiwi med den [i]'ende plads i arrayet. Hver gang den kører stiger i med 1.
        int i = 0;      //int "i" bliver givet værdien 0
        while (i < a.length) {                                //while loop, kunne simplifiseres med "for (i = 0; i < a.length; i++;) {"
            kiwi = kiwi * a[i];                               //hver gang loopet kører vil "kiwi" blivet ganget med den [i]'ende plads i arrayet.
            i++;                                              //hver gang loopet kører vil "i" stige med 1
        }
        return kiwi;                                          //når conditionen "i" while loopet ikke længere er sandt, vil den return "kiwi" med en ny værdi.
    }                                                         //metoden banana er slut.

    public static int grapefruit(int[] a, int grape) {        //Denne metode bruger int array "a" og int "grape" til at lave et "for" loop, der også benytter sig af
        for (int i = 0; i < a.length; i++) {                  //en "if-statement". Den er brugt til at "Traverse Array".
            if (a[i] == grape) {                              //for loopet laver det der hedder en "search" som leder efter et bestemt element. Loopet vil return med
                return i;                                     //"i" hvis det er blevet fundet, og vil ellers return med "-1" hvilket vil sige "searchen" er fejlet.
            }
        }
        return -1;
    }                                                         //Metoden grapefruit er slut.

    public static int pineapple(int[] a, int apple) {         //Denne metode giver os int "pear" lig 0, og bruger et enhanced "for" loop.
        int pear = 0;                                         //int "pear" bliver givet værdien 0.
        for (int pine : a) {                //"enhanced for loop" fjerner midlertidige variabler, "i = 0; i < a.length; i++". Kan læses som "for each" "pine" i "a"
            if (pine == apple) {                              //"if-statement" med condition at hvis
                pear++;                                       //"pine" er lig "apple" skal der lægges +1 til pear.
            }
        }
        return pear;                                          //når loopet ikke kan finde flere "pine" vil den returne pear.
    }
}