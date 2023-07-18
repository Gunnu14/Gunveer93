package Loops;

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 1;
//        for (i = 1; i <=20; i++ )
//        {
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//                i++;
//            } else {
//                System.out.println("odd");
//            }
//        }
        System.out.print("Even numbers are");

//        while(i<=20){
//
//            if (i % 2==0){
//                System.out.print(i + "  ");
//
//            }
//            i++;

        do {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
            i++;

        }
        while (i <= 20);
    }}