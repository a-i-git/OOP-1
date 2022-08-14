package Inheritance;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        System.out.println("Hello world ");
        class Addition{
            void add(int a,int b) {
                int sum = 0;
                sum = a + b;
                System.out.println("Sum of the two numbers is : " + sum);
            }
        }
        class Subtraction extends Addition{
            void sub(int a,int b){
                int diff=0;
                diff=a-b;
                System.out.println("Difference of the numbers is : "+diff);
            }
            void Mul(int a,int b){
                int mul=0;
                mul=a*b;
                System.out.println("Multiplication of the numbers is :"+mul);
            }
        }
        //Object of Subtraction is used to access the method add()/any methods of class Addition.
        Addition cl=new Addition();
        Subtraction sl=new Subtraction();
        sl.add(5,7);
        sl.sub(3,4);
        Scanner a=new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.print("Enter num2 ");
        int num2=a.nextInt();
        sl.Mul(num1,num2);
    }
}
