public class printcombinratnmaz {
    
    public static void printcombine(int sr, int sc, int er, int ec,String str) {
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(str);
            return;
        }

            //goes down
            printcombine(sr + 1, sc, er, ec, str+'D');
    
            //goes right
            printcombine(sr, sc+1, er, ec, str+'R');
    
        }

    public static void main(String[] args) {
        int row = 3, col = 3;
        printcombine(1, 1, row,col,"");



    }
}
