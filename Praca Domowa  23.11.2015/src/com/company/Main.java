package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)   {

        System.out.println("Start programu");
        System.out.println("Twoje pieniadze");

        Scanner cenawpisz = new Scanner(System.in);
        int cena = cenawpisz.nextInt();

        System.out.println("20");

//        Scanner ilerat = new Scanner(System.in);
        int rata = cenawpisz.nextInt();
        cenawpisz.close();

        double wynik1 = cena*2.5/rata;
        double wynik11 = cena*2.5;
        double wynik2 = cena*5/rata;
        double wynik21 = cena*5;
        double wynik3 = cena*10/rata;
        double wynik31 = cena*10;

        if(rata<=12){
            System.out.println("Twoja rata wyniesie " + wynik1);
            System.out.println("Przy " + rata + " ratach kwota ca³kowita wyniesie " + wynik11);
        }
        if(rata<=24){
            System.out.println("Twoja rata wyniesie " + wynik2);
            System.out.println("Przy " + rata + " ratach kwota ca³kowita wyniesie " + wynik21);
        }
        if(rata<=48){
            System.out.println("Twoja rata wyniesie " + wynik3);
            System.out.println("Przy " + rata + " ratach kwota ca³kowita wyniesie " + wynik31);
        }









    }
}
