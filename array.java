package learning;


import java.util.Scanner;

// arrays in java
public class array{ 
	public static void main(String args[]){
         int a[] = new int[3];
         int i;
        System.out.println("Enter numbers:");
        Scanner scr = new Scanner(System.in);
        for(i=0;i<3;i++){
            a[i] = scr.nextInt();
        }
        System.out.printf("the elements are:\n");
        for(i=0;i<3;i++){
            System.out.println(a[i]);
        }
        
    }
}
