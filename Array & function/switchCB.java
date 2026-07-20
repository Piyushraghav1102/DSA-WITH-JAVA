import java.util.*;
import java.util.Scanner;


public class switchCB {
    
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number :-");
        int num1=sc.nextInt();

        System.out.println("Enter the second number :-");
        int num2=sc.nextInt();

        System.out.println("Enter the operator :-");
        char opr=sc.next().charAt(0);

        
        switch (opr) {
            
            case '+':System.out.println("This is the addtion of two number :- "+(num1+num2));
                    break;
            case '-':System.out.println("This is the addtion of two number :- "+(num1-num2));
                    break;
            case '*':System.out.println("This is the addtion of two number :- "+(num1*num2));
                    break;
            case '/':System.out.println("This is the addtion of two number :- "+(num1/num2));
                    break;
    

            
        
            default:System.out.println("My Calcualator is not a machine");
                break;
        }



    }
}
