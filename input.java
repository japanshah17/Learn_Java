 import java.util.Scanner;
 import java.util.InputMismatchException;
public class input{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in); // create a scanner object
        int x;
        String name;
        System.out.println("enter a number and name:");
        x = j.nextInt();
        name = j.nextLine();
        System.out.printf("int value is %d and name is %s",x,name);
    }
}
