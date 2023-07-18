package Loops;

import java.util.Scanner;

public class Table5 {
    public static void main(String[] args) {
        int i;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table to be print");
        num= scanner.nextInt();

//        while(i<=10){
//            System.out.println(num + "X" + i + "=" + (num * i));
//            i++;
//        }

//        do{
//            System.out.println(num + "X"+ i + "="+ (num*i));
//            i ++;
//        }while(i <=10);
        for(i=1; i<=10; i++)
        {
            System.out.println(num + "X"+ i+ "=" + (num*i));

        }i++;

    }
}
