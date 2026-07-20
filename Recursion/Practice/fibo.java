package Practice;

public class fibo {
    
    public static int calfibo(int n) {
        
        if (n <= 1) 
            return n;

        return calfibo(n - 1) + calfibo(n - 2);
    }
    
    
    public static void main(String[] args) {
        System.out.println(calfibo(6));
    }
}
