package com.funplays1;

import java.util.Scanner;

public class A_B_and_divisibility {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A= inp.nextInt();
        int B= inp.nextInt();
        int coun=0;
        while (A%B!=0){
            A++;
            coun++;
        }
        System.out.print(coun);


    }
}
