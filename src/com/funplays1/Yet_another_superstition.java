package com.funplays1;
//https://www.hackerrank.com/contests/weekly-junior-practice-sprint-22-1/challenges/yet-another-superstition/problem
import java.util.Scanner;

public class Yet_another_superstition {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year=inp.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400==0){
                System.out.print("no");
            }
            if(year%100!=0){
                System.out.print("no");
            }
            else {
                System.out.print("yes");
            }
        }
        else {
            System.out.print("yes");
        }

    }
}
