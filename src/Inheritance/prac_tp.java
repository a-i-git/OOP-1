package Inheritance;

import java.util.Scanner;
import java.lang.String;


public class prac_tp {

    public static void main(String[] args) {
        class eval{
            public static void functo(int n,char c){
                int sq=0,cb=0;
                String str =new String();
                if(c=='S'){
                    sq=n*n;
                    System.out.println("The square of the number is : "+sq);
                }
                else {
                    cb = n * n * n;
                    System.out.println("The cube of the number is : " + cb);
                }

            }
        }
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter a Character ");
        char ch = b.next().charAt(0);
        eval ec = new eval();
        ec.functo(num, ch);
    }

    }



