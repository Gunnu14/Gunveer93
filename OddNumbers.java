package Loops;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the digit");
        i= scanner.nextInt();
//        while(i <= 20){
//           if(i%2==1){
//               System.out.println(i);
//
//           }
//          i++;
  //      }
        System.out.print("Odd numbers are:");
         do{

             if(i %2==1){
                 System.out.print(i + "  ");
             }
             i++;

         }while(i<=20);



    }
}
