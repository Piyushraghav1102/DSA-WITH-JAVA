
public class Printing {

    /*
     * public static void printnum(int n) {
     * 
     * if (n == 1) {
     * System.out.println(n);
     * return; // Print Decreasing number
     * }
     * System.out.println(n);
     * 
     * printnum(n - 1);
     * 
     * }
     */

    public static void Printinc(int n) {
        if (n == 1) {
            System.out.println(n);
            return; // Print Decreasing number
        }
        Printinc(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {

        Printinc(5);

    }
}
