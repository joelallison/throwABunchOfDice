package com.joelallison;

import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer, Integer> dieTally = new HashMap<Integer, Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Throwing a bunch of dice!\n\n");
        System.out.println("How many sides does the die have?");
        int sidesNum = input.nextInt();
        System.out.println("How many times do you want to throw it?");
        int numOfThrows = input.nextInt();

        for (int i = 0; i < numOfThrows; i++) {
            int currentRoll = random.nextInt(sidesNum+1);
            dieTally.put(currentRoll, dieTally.get(currentRoll) + 1);
            System.out.println(dieTally.get(i));
        }
    }
}
