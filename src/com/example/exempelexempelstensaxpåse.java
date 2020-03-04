package com.example;

import java.util.Random;
import java.util.Scanner;

public class exempelexempelstensaxpåse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        /*Variabel för användarens val
        0=Sten
        1=Sax
        2=Påse
         */
        int continuee = 0;
        int spelarensVal;
        int datansVal;

        //Användarens val
        System.out.println("Var god och välj en av följande: Sten(0), Sax(1), Påse(2):");
        spelarensVal = scan.nextInt();

        //Visar användarens val 0,1,2
        if (spelarensVal < 0 || spelarensVal > 2) {
            System.out.println("Ogiltigt val, Spelat avslutas");
            System.exit(0);
        }

        //Datorns val genereras
        datansVal = random.nextInt(3);
        System.out.println(datansVal);
        System.out.println(spelarensVal);

        //Om valen är lika
do {


        if (spelarensVal == datansVal) {
            System.out.println("Spelare och dator valde lika, oavgjort");



        } else if (spelarensVal == 1 && datansVal == 2) {
            System.out.println("Spelaren vann, som valde sax");



        }
            else if (spelarensVal == 0 && datansVal == 1) {
                System.out.println("Spelare vinner, som valde Sten");




            } else if (spelarensVal == 1 && datansVal == 0) {
                System.out.println("Datorn vinner, som valde Sten");



            } else if (spelarensVal == 2 && datansVal == 0) {
                System.out.println("Spelare vinner, som valde Påse");



            } else if (spelarensVal == 0 && datansVal == 2) {
                System.out.println("Datorn vinner, som valde Påse");



            }
    System.out.println("För att fortsätta tryck 0, för att avsluta tryck 1");
    continuee = scan.nextInt();

            //Avsluta spelet
            //System.exit(0);

}  while (continuee ==0);
        }
    }




