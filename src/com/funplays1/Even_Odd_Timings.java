package com.funplays1;
//https://www.hackerrank.com/contests/weekly-junior-practice-sprint-22-1/challenges/even-odd-timings
import java.util.Scanner;

public class Even_Odd_Timings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time=in.nextInt();
        if(time%2==0){
            System.out.print("Alice");
        }
        else {
            System.out.print("Bob");
        }
    }
}
