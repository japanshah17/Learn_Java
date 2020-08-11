public class do_while_loop{ 
	public static void main(String args[]){
        int a = 3,i=0;
        do{                                           // it will go inside the block without checking the condition once
            System.out.println("the value of i is " +i);
            i++;                                     // an increment after printing the value
        }                             
        while(i<a);                                 // now it works as while loop, with cheking condition.
    }
}