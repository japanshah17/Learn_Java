class okay{ // creating a class
 private int marks; // data member is declared as private
 void set(int m){  // a public function to set the data. 
 marks = m; // the passed int will be assigned to marks.
}
void print(){
    System.out.println(marks); // marks will be printed
}
}
public class Class_java{
    
    public static void main(String args[]){
        /*
        you can also make data members and mem func. of the class Class_java.
        private int marks; // data member is declared as private
         void set(int m){  
        marks = m; 
        }
        void print(){
         System.out.println(marks);
        }

        // creating obj::  Class_java a1  = new Class_java();
        a1.set(10)and a1.print() Will also give the same output
        */ 
        okay a1  = new okay(); // creating the object of the class.
        a1.set(10);
        a1.print();
    }
}
