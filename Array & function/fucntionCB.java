import java.util.*;

public class fucntionCB {
    
public static double areaofcircle(double rad){      //this rad is the parameters  

    double area=3.14*rad*rad;
    return area;
} 
public static int fact(int n){
    int f=1;

    for (int i=1;i<=n;i++){                         //factorial of a number
        f=f*i;
    }
    System.out.println("This is the factorial of "+n+":-"+f);
    return f;
}


// Method Overloading 
public static int sum(int a,int b ){

    int c=a+b;                              
    return c;
}                                                       //when function have a same name and                                                    diff parametrers & diff datatypes
public static float sum(float a,float b ){

    float c=a+b;
    return c;
}
//End Method overloading 




    public static void main (String args[]){    
        Scanner sc=new Scanner(System.in);
        
        // System.out.print("Enter the radius of Circle :-");
        // double rad=sc.nextDouble();
        // double area=areaofcircle(rad);  //rad is the arguments 

        // System.out.println("Area of a circle is :- "+area);

        // int n=fact(5);

        System.out.println("This is the sum of number  :-"+sum(4,6));
}

}


