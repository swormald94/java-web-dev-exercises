package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(4);
        numberList.add(7);
        numberList.add(8);
        numberList.add(23);

        int answer = addNumbers(numberList);
        System.out.println(answer);

    }

    public static int addNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }

        }
        return sum;
    }
}
