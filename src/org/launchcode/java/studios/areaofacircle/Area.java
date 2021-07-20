package org.launchcode.java.studios.areaofacircle;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        String userInput = input.nextLine();
        double radius = Double.parseDouble(userInput);
        System.out.println("The area of a circle with radius " + radius + " is: " + Circle.getArea(radius));
        input.close();
    }

//    public static double calculateCircleArea(double userRadius) {
//        return Math.PI * userRadius * userRadius;
//    }
}
