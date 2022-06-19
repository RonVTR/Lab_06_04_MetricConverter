package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dd = new Scanner(System.in);

        System.out.println("Enter distance in meters " );
        float a = dd.nextFloat();

        System.out.println("Your distance in miles is " + a / 1609.344);
        System.out.println( "Your distance in feet is " + a * 3.28084);
        System.out.println("Your distance in inches is " + a * 39.370079);



    }
}
