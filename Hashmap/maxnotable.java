
import java.util.HashSet;

public class maxnotable {
    
     static int Findmaxontable(int arr[]) {
        
        HashSet<Integer> hs = new HashSet<>();

        int max = 0;

        
        for (Integer i : arr) {
         
            if (!hs.contains(i)) {
                hs.remove(i);
            }
            else {
                hs.add(i);
                max = Math.max(max, hs.size());
            }
        }
        return max;

    }
    
    public static void main(String[] args) {
        
        int arr[] = { 2,1,1,2,3,3 };

        System.out.println("This is the maximum element on table :- "+Findmaxontable(arr));

    }
}
