package Loops;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number :");
        num= scanner.nextInt();

       while(i<=num) {
           sum = sum +i;

       i++;
       }
        System.out.print(sum + " ");

//        do{
//            sum =sum+i;
//            i++;
//        }while(i<=num);
//
//        System.out.print(sum + " ");


//        for(i=1; i<=num; i++){
//            sum =sum +i;
//        }
//        System.out.println(sum + " ");

//
    }
}
