/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr4;

import java.util.Scanner;

/**
 *
 * @author st
 */
/**
 * @param args the command line arguments
 */
class Utility {

    public static long factorial(long term) {
        long fact = 1;
        for (long i = 1; i <= term; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int value) {
        int c = 0;
        boolean f = false;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                c++;
            }

        }
        if (c == 2) {
            f = true;
        }
        return f;
    }

    public static boolean isOdd(long value) {
        boolean f;
        if (value % 2 == 0) {
            f = false;
        } else {
            f = true;
        }
        return f;

    }
    
    public static boolean isEven(long value) {
        boolean f;
        if (value % 2 == 0) {
            f = true;
        } else {
            f = false;
        }
        return f;

    }
}

public class PR3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1 for find factorial");
            System.out.println("2 for check no is prime or not");
            System.out.println("3 for check no is odd or not");
            System.out.println("4 for check no is even or not");
            System.out.println("Enter your choice : ");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    long term;
                    System.out.println("Enter term for find factorial : ");
                    term = s1.nextInt();
                    long fact = Utility.factorial(term);
                    System.out.println("Factorial : " + fact);
                    break;
                case 2:
                    int n;
                    boolean f;
                    System.out.println("Enter number : ");
                    n = s1.nextInt();
                    f = Utility.isPrime(n);
                    if (f) {
                        System.out.println("No is prime");
                    } else {
                        System.out.println("No is not prime");
                    }
                    break;
                case 3:
                    int n1;
                    boolean f1;
                    System.out.println("Enter number : ");
                    n1 = s1.nextInt();
                    f1 = Utility.isOdd(n1);
                    if (f1) {
                        System.out.println("No is odd");
                    } else {
                        System.out.println("No is not odd");
                    }
                    break;
                case 4:
                    int n2;
                    boolean f2;
                    System.out.println("Enter number : ");
                    n2 = s1.nextInt();
                    f2 = Utility.isEven(n2);
                    if (f2) {
                        System.out.println("No is Even");
                    } else {
                        System.out.println("No is not Even");
                    }
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
                  
            }
        }
    }

}
