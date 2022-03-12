package com.le;

import java.util.Random;
import java.util.Scanner;

public class Guess1to10for {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        while (true) {
            System.out.println("please enter a number");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            System.out.println("user" + s);
            int num = Integer.parseInt(s);

            if (num < secret) {
                System.out.println("bigger");
            }

            if (num > secret) {
                System.out.println("smaller");
            }
            if (num == secret) {
                System.out.println("Bingo");
                break;
            }
        }
    }
}
