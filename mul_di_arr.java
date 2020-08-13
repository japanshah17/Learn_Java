package learning;


import java.util.Scanner;

public class mul_di_arr {
    public static void main(String args[]){
         int a[][] = new int[][]{ {1,2} , {4,6} };
         int i,j;
        System.out.println("Enter numbers:");
        Scanner scr = new Scanner(System.in);
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                a[i][j] = scr.nextInt();                
            }
        }
        System.out.printf("the elements are:\n");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
               System.out.print(a[i][j]);                
            }
        }
        
    }
}
