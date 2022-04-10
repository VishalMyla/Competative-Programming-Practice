package com.funplays1;
//https://www.hackerrank.com/contests/weekly-junior-practice-sprint-22-1/challenges/break-the-sticks
import java.util.Scanner;

public class Break_the_sticks {
    public static void main(String[] args) {
        int A,B,C;
        Scanner inp = new Scanner(System.in);
        A= inp.nextInt();
        B= inp.nextInt();
        C=inp.nextInt();

        if(A==B || B==C || C==A){
            if(A==B){

                if(C%2==0 && C!=0){
                    System.out.print("yes");
                }

                else {
                    System.out.print("no");
                }
            }
            else if(B==C){
                if(A%2==0 && A!=0){
                    System.out.print("yes");
                }
                else {
                    System.out.print("no");
                }
            }
            else if (C==A){
                if(B%2==0 && B!=0){
                    System.out.print("yes");
                }

                else {
                    System.out.print("no");
                }
            }

        }
        else{
          if(high_num(A,B,C)==A){
              if((A-C)!=B){
                  System.out.print("no");
              }
              else {
                  System.out.print("yes");
              }

          }
            if(high_num(A,B,C)==B){
                if((B-C)!=A){
                    System.out.print("no");
                }
                else {
                    System.out.print("yes");
                }

            }
            if(high_num(A,B,C)==C){
                if((C-A)!=B){
                    System.out.print("no");
                }
                else {
                    System.out.print("yes");
                }

            }
        }


    }
    static int high_num(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        if(b>a && b>c){
            return b;
        }
        if(c>b && c>a){
            return c;
        }
        return -1;
    }
}
