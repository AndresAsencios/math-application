package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 23000;
        double garySalary = 34333;

        // Math.max compares two numbers and returns the larger one.
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);


        double carPrice = 25000;
        double truckPrice = 30000;
        // Math.min returns the smaller of two values
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is $" + lowestPrice);

        double radius = 7.25;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is " + area);

        double number = 5.0;

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root " + squareRoot);

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("The distance is " + distance);

        // Math.abs() absolute value
        double number1 = -3.8;

        double absoluteValue = Math.abs(number1);

        System.out.println("The absolute value is " + absoluteValue);
        // Math.abs() removes the negative sign from a negative number

        // Math.random() random number generator
        double randomNumber = Math.random();

        System.out.println("Random number: " + randomNumber);
        // Math.random() returns a random double from 0.0 (inclusive) to 1.0 (exclusive).

        int days = 24;
        int hours = days * 24;
        int minutes = hours * 60;

        long milliseconds = (long) minutes * 60 /*minutes */ * 1000 /* milliseconds */;

        System.out.println("Total minutes: " + minutes);
        System.out.println("Total milliseconds: " + milliseconds);





    }
}