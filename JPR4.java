
package jpr4;

import java.util.Scanner;
class Number {

    private double number;

    public boolean isZero(double number) {
        boolean f = false;
        this.number=number;
        if(number==0)
            f=true;
        return f;
    }
    public boolean isPositive(double number) {
        boolean f = false;
        this.number=number;
        if(number>0)
            f=true;
        return f;
    }
    public boolean isNegative(double number) {
        boolean f = false;
        this.number=number;
        if(number<0)
            f=true;
        return f;
    }
    public boolean isOdd(double number) {
        boolean f = false;
        this.number=number;
        if(number%2!=0)
            f=true;
        return f;
    }
    public boolean isEven(double number) {
        boolean f = false;
        this.number=number;
        if(number%2==0)
            f=true;
        return f;
    }
    public double getFactorial(double number) {
        double fact = 1;
        this.number=number;
        for (double i = 1; i <=number ; i++) {
            fact *= i;
        }
        return fact;
    }

}

public class JPR4 {


    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Number No=new Number();
        int choice;
        while (true) {
            System.out.println("1 for check no is Zero or not");
            System.out.println("2 for check no is Positive or not");
            System.out.println("3 for check no is Negativetive or not");
            System.out.println("4 for check no is odd or not");
            System.out.println("5 for check no is even or not");
            System.out.println("6 for find factorial");
            System.out.println("Enter your choice : ");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    int n1;
                    boolean f1;
                    System.out.println("Enter number : ");
                    n1 = s1.nextInt();
                    f1 = No.isZero(n1);
                    if (f1) {
                        System.out.println("No is Zero");
                    } else {
                        System.out.println("No is not Zero");
                    }
                    break;
                case 2:
                    int n3;
                    boolean f3;
                    System.out.println("Enter number : ");
                    n3 = s1.nextInt();
                    f3 = No.isPositive(n3);
                    if (f3) {
                        System.out.println("No is Positive");
                    } else {
                        System.out.println("No is not Positive");
                    }
                    break; 
                case 3:
                    int n4;
                    boolean f4;
                    System.out.println("Enter number : ");
                    n4 = s1.nextInt();
                    f4 = No.isNegative(n4);
                    if (f4) {
                        System.out.println("No is Negative");
                    } else {
                        System.out.println("No is not Negative");
                    }
                    break;    
                
                case 4:
                    int n5;
                    boolean f5;
                    System.out.println("Enter number : ");
                    n5 = s1.nextInt();
                    f5 = No.isOdd(n5);
                    if (f5) {
                        System.out.println("No is odd");
                    } else {
                        System.out.println("No is not odd");
                    }
                    break;
                case 5:
                    int n2;
                    boolean f2;
                    System.out.println("Enter number : ");
                    n2 = s1.nextInt();
                    f2 = No.isEven(n2);
                    if (f2) {
                        System.out.println("No is Even");
                    } else {
                        System.out.println("No is not Even");
                    }
                    break;
                case 6:
                    double term;
                    System.out.println("Enter term for find factorial : ");
                    term = s1.nextInt();
                    double fact = No.getFactorial(term);
                    System.out.println("Factorial : " + fact);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
                  
            }
        }
    }

}
