package ie.atu_ArrayList;

import java.util.Scanner;

public class ArrayDemo {


    public static void main(String[] args) {
        int[] arrayA;
        arrayA = new int[10];
        int i,x;
        Scanner input = new Scanner(System.in);
       for(x = 0;x<=10;x++){
           try {
               System.out.println("Please enter a new value");
               arrayA[x] = input.nextInt();

           }
           catch (ArrayIndexOutOfBoundsException aiob) {
               System.out.println("Value is not within array");
           }

       }
       for(i=0;i<10;i++){
           System.out.println("Element at index" + i +": "+ arrayA[i]);
        }


    }



}
