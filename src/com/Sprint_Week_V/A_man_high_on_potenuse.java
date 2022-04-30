package com.Sprint_Week_V;

import java.util.Scanner;

//https://www.hackerrank.com/contests/aasf-weekly-junior-practice-sprint-v2022/challenges/a-man-high-on-potenuse
public class A_man_high_on_potenuse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i=0;i<t;i++){
            System.out.println(fun());
        }


    }
    static int fun(){
        Scanner in=new Scanner(System.in);
      long n= in.nextLong();
      int count=0;
      for(long a=3;a*a<=2*n-1 && a<=n;a+=2){
          count++;
      }
      return count;
    }

}
