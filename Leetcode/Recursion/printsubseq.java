import java.util.ArrayList;
import java.util.List;

public class printsubseq {

    public static void printingsubseq(int arr[], int i, List<Integer> l, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(l);
            }
            return;
        }
        
        //take
        l.add(arr[i]);
        sum += arr[i];
        printingsubseq(arr, i + 1, l, sum, k);

        sum -= arr[i];
        l.remove(l.size() - 1);

        //not take
        printingsubseq(arr, i + 1, l, sum, k);
    }
    
    public static int countprintingsubseq(int arr[], int i, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        //take
      
        sum += arr[i];
        int left=countprintingsubseq(arr, i + 1, sum, k);

        sum -= arr[i];
    
        //not take
        int right = countprintingsubseq(arr, i + 1, sum, k);
        
        return left + right;
    }

    public static boolean printingsubseqonlyone(int arr[],int i,List<Integer> l,int sum,int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(l);
                return true;
            } 
            else
            return false;
        }
        //take
        l.add(arr[i]);
        sum += arr[i];
        
        if (printingsubseqonlyone(arr, i + 1, l, sum, k) == true) {
            return true;
        }
       
        sum -= arr[i];
        l.remove(l.size() - 1);
    
        //not take
        if (printingsubseqonlyone(arr, i + 1, l, sum, k) == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
      
        int arr[] = { 1, 2, 1 };
        List<Integer> l = new ArrayList<>();

        printingsubseq(arr, 0, l, 0, 2);
      System.out.println();


        
    }    
}
