package com.company;

import java.awt.*;
import java.util.Scanner;

public class calculator {
    public static void main(String []args) {
        System.out.print("\nWelcome to my calculator project on Java\n\nprogrammed by @ysr075 on GitHub");
        while(true) {
            Scanner input = new Scanner(System.in);
            Integer choose;
            System.out.print("\n\n1.add / 2.substract / 3.multiply / 4.divide: ");
            choose = input.nextInt();
            if (choose.equals(1)) {
                float num1;
                System.out.print("\nnum1: ");
                num1 = input.nextInt();
                float num2;
                System.out.print("num2: ");
                num2 = input.nextInt();
                float total = num1 + num2;
                System.out.print("\n" + total);
            } else if (choose.equals(2)) {
                int num1;
                System.out.print("\nnum1: ");
                num1 = input.nextInt();
                int num2;
                System.out.print("num2: ");
                num2 = input.nextInt();
                float total = num1 - num2;
                System.out.print("\n" + total);
            } else if (choose.equals(3)) {
                int num1;
                System.out.print("\nnum1: ");
                num1 = input.nextInt();
                int num2;
                System.out.print("num2: ");
                num2 = input.nextInt();
                float total = num1 * num2;
                System.out.print("\n" + total);
            } else if (choose.equals(4)) {
                int num1;
                System.out.print("\nnum1: ");
                num1 = input.nextInt();
                int num2;
                System.out.print("num2: ");
                num2 = input.nextInt();
                float total = num1 / num2;
                System.out.print("\n" + total);
            } else {
                System.exit(1);
            }
        }
    }
}
