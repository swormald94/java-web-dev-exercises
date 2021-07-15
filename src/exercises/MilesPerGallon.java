package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        Double miles = input.nextDouble();
        System.out.println("Enter gallons of gasoline consumed:");
        Double gallons = input.nextDouble();
        Double milesPerGallon = (miles / gallons);
        System.out.println("Gas Mileage for Trip was " + milesPerGallon);

        input.close();
    }
}

