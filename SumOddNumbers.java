package Loops;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        int i;
        int sum=0;
        int num;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any odd number");
        num= scanner.nextInt();


//        while(i<=num) {
//            if (i % 2 == 1) {
//                sum = sum + i;
//
//            }
//            i++;
//        }
//        System.out.print("Sum of odd numbers is :" + sum);

//        do{
//            if(i % 2==1){
//                sum = sum +i;
//            }i++;
//
//        }while(i<=num);
//        System.out.println("Sum of odd numbers is " + sum);

        for (i=1; i<=num;i++)
        {
            if(i% 2==1){
                sum =sum+i;
            }i++;
        }
        System.out.println("Sum of odd numbers is "+ sum);




    }
}
