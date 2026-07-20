import java.util.*;
/* 
public class loopCB {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sum of n num: ");
        int num = sc.nextInt();
        int sum=0; 
        int i=1;


        while (i<=num){         //i is iterate from  1 to num
            sum += i;           //sum is store sum + i
            i++;                //i is increment by 1
        }
        System.out.println("Sum of num :- "+sum);
            
    }
}
*/

/*public class loopCB {   
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no of lines");
    int lines=sc.nextInt();
   
   /* for(int i=1;i<=lines;i++){                    // just for printing the pattern its easy
        System.out.println("* * * *");
        
    }
    }

    int i=1;
    while (i<=lines){
       System.out.println("* * * *");
       i++;
       
     }     
   }
}*/
/* 
public class loopCB {   
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no :- ");
        int num=sc.nextInt();

        while(num==0){
            
            int last=num%10;
            System.out.println(last);

            num=num/10;


        }
   }
}
   */
public class loopCB {   
    public static void main (String []args){
       Scanner sc = new Scanner(System.in);

        // do{
        //     System.out.println("Enter the num :- ");
        //     int i=sc.nextInt();

        //     if (i%10==0){
        //         break;
           //     }                                         // for break statement 

        //     System.out.println(i);

        // }while(true);


        for (int i=1;i<=5;i++){

            if (i==2){
                continue;

            }
        System.out.println(i);
        }




   }
}
   