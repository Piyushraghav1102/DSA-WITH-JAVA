public class Ratnmaxze extends printcombinratnmaz{
    
    public static int maz(int sr, int sc, int er, int ec) {
       
        if (sr > er || sc > ec)
            return 0;

        if (sr == er && sc == ec)
            return 1;
       
       
       
        int rightways = maz(sr, sc + 1, er, ec);
        int downways = maz(sr + 1, sc, er, ec);
        
        int totalways = rightways + downways;
        return totalways;

    }
    
    
    
    public static void main(String[] args) {
        int row = 2, col = 2;
        
        int count = maz(1,1,row,col);
        
        System.out.println("these are all ways :- " +count);
    
    }
}
