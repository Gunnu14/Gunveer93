package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int i;
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");

        for(i=1; i<=10;i++) {

            num= scanner.nextInt();
            if (num <0) {
                break;
            }}
            System.out.println("Sorry condition not matches");


    }
}
