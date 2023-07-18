package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int i;
        int sum=0;
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any even number :");
        num = scanner.nextInt();

//        while (i <= num) {
//          if(i % 2==0) {
//              sum = sum + i;
//
//          }
//          i++;
//          } System.out.println("Sum of even numbers is : " + sum);
//        }
//        do {
//            if (i % 2 == 0) {
//
//                sum = sum + i;
//
//            }
//            i++;
//        }while (i <=num);
//        System.out.println("Sum of even numbers is: " + sum);
        for(i=2; i<=num;i++)
        {
           if (i %2==0){
            sum = sum+i;
        }
            i++;
        }
        System.out.print("Sum of even numbers is" +  sum);
    }
}