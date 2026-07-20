import java.util.*;

public class prime {
    public static void main (String main[]){
    Scanner sc=new Scanner (System.in);

    System.out.println("Enter the num which you want to check :- ");
    int num=sc.nextInt();

    Boolean type=true;
    
    for (int i=2;i<=num-1;i++){

        if (num % i == 0){
                        
            type=false;
        }
        
    }
    if(type==true){
        System.out.println("this is prime no ");

    } else{
        System.out.println("this is not prime");
    }
    }
}
