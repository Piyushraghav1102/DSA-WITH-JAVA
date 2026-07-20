class print {
    public static int Fibo(int n){
        if(n==0 ||  n==1){
            return n;
        }
     int ans=Fibo(n-2)+Fibo(n-1);
        return ans;
    }
    
    public static void main(String[] args) {

        System.out.println(Fibo(6));
    }
}