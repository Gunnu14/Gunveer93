package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        int i;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        i= scanner.nextInt();
        for(i=1; i<=10;i++)
        {


        if(i%2!=0) {
            continue;
        }
            System.out.println(i);
}}}
