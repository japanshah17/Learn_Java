 import java.util.InputMismatchException;
 import java.io.*;
public class inputdemo{
    public static void main(String[] args) throws Exception {
        BufferedReader j = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number:");
        int x = Integer.parseInt(j.readLine()); 
        System.out.printf("int value is %d",x);
    }
}
 