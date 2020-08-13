package learning;

import java.util.Scanner;
class students{
    int number;
    String name;
    students(int nu , String na){
        this.number = nu;
        this.name = na;
    }
}


public class arr_class {
    	public static void main(String args[]){
         students a[] = new students[3];
         a[0] = new students(1,"japan");
         System.out.println("number is "+a[0].number+" and name is "+a[0].name);
          
        }
    }
