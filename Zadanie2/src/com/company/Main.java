package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        String trr = "asxas";
        int Mapa[] = new int[3];
        Mapa[0] = metoda1(trr);
        Mapa[1] = metoda2(trr);
        Mapa[2] = metoda3(trr);
        System.out.println("Znaki: " + Mapa[0]);
        System.out.println("Znaki białe: " + Mapa[1]);
        System.out.println("Słowa: " + Mapa[2]);
    }
    // znaki
    public static int metoda1(String trr)throws FileNotFoundException {
        File = "asxas";
        Scanner scaner = new Scanner(new File("asxas")).useDelimiter("[\\x00-\\x7F]");
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
    //znaki białe
    public static int metoda2(String plik)throws FileNotFoundException {
        Scanner scaner = new Scanner(new File(plik)).useDelimiter("[ \\t\\n\\x0B\\f\\r]");
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
    // słowa
    public static int metoda3(String plik)throws FileNotFoundException {
        Scanner scaner = new Scanner(new File(plik));
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
}
