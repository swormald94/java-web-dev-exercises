package org.launchcode.java.exercises;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] arg) {
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.println(nums[i]);
            }
        }

//        String phrase = "I would not, could not, in a box. I would not, could not with a fox.  " +
//                "I will not eat them in a house. I will not eat them with a mouse.";
//
//        String[] words = phrase.split( regex: "\\.");
//        System.out.println(Arrays.toString(words));
    }
}

