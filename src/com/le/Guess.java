package com.le;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random=new Random();
        int secret=  random.nextInt(100)+1;
        int num=0;
        int min=0;
        int max=100;
        while (num!=secret){
            System.out.println("enter"+min+"~"+max);
            Scanner scanner= new Scanner(System.in);
            String s= scanner.next();
            num=Integer.parseInt(s);
            if (num<secret){
                min=num;
            }else {
                max=num;
            }
        }
        System.out.println("Bingo");
    }
}
