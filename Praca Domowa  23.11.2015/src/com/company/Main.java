
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)   {

        System.out.println("Start programu");
        System.out.println("Twoje pieniadze");

        Scanner cenawpisz = new Scanner(System.in);
        int cena = cenawpisz.nextInt();

        System.out.println("ilosc rat");

//        Scanner ilerat = new Scanner(System.in);
        int rata = cenawpisz.nextInt();
        cenawpisz.close();

        double wynik1 = cena*0.025/rata;
        double wynik11 = cena*rata;
        double wynik2 = cena/rata+cena/rata*0.05;
        double wynik21 = wynik2*rata;
        double wynik3 = cena/rata+cena/rata*0.1;
        double wynik31 = wynik3*0.1;

        if(rata<=12){
            System.out.println("Twoja rata wyniesie " + wynik1);
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik11);
        }
         else if(rata<=24){
            System.out.println("Twoja rata wyniesie " + wynik2);
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik21);
        }
        else if(rata<=48){
            System.out.println("Twoja rata wyniesie " + wynik3);
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik31);

        }
