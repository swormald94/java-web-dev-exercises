package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length:");
        Double length = input.nextDouble();
        System.out.println("Enter rectangle width:");
        Double width = input.nextDouble();
        Double area = (length * width);
        System.out.println("Area of rectangle is " + area);

        input.close();
    }
}

