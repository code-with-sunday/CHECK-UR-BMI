package com.javaclass.bmicheck;

import java.util.Scanner;

public class BmiMain {
//    BMI Calculator(CLI) :
//    Implement a BMI calculator that takes input from a user and returns the BMI result.
//            NB: BMI => Body Mass Index
//    Formula => (weight /  height * height) * 10000
//    A BMI of 25.0 or more is OVER_WEIGHT,
//while the healthy range is 18.5 to 24.9 NORMAL_WEIGHT
//    and a BMI of less than 18.5 is UNDER_WEIGHT.

    public static void main(String[] args) {

        System.out.println("Please input your weight : ");
        Scanner scanner = new Scanner(System.in);
        double myWeight = scanner.nextDouble();
        System.out.println("Please input your height : ");
        double myHeight = scanner.nextDouble();

        Bmimodel sunday = new Bmimodel(myWeight,myHeight);

        System.out.println(sunday.getWeight());

        sunday.Bmi();


    }



}
