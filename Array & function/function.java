import java.util.*;



public class function {
    
// public static void printhello(String a){
    
//     System.out.println("Hello "+a+"\nNice to meet you");

// }
// public static boolean primeno(int a){

//     boolean isprime=true;

//     for (int i=2;i<=Math.sqrt(a);i++){
//         if(a % i ==0){
//         isprime=false;
//         break;
//     }
// }
//     return isprime;
// }
// public static void isprime(int a){

//     for (int i=2;i<=a;i++){
//         if(primeno(i)){//this is prime no just print it 
//             System.out.print(i);
//         }
//     }
// }
public static void avg(int a,int b,int c){

    int d =(a+b+c)/3;
    System.out.println("this is the evg of no:-"+d);
}
public static void main(String args []){
    Scanner sc=new Scanner (System.in);
    
    // System.out.println("--Hey! Whats up-- ");
    // System.out.println("What is your name :- ");
    // String a=sc.nextLine();
    // printhello(a);
    
// isprime(8);
avg(2, 3, 4);

}
}
