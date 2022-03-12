package com.le;

public class StarLineArrow {
    public static void main(String[] args) {
        for (int i=0;i<10 ;i++){
            for (int j=0;j<20;j++){
                if (2*i==19-j&& 5<=i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if (2*i==j&& i<5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
