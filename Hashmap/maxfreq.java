
import java.util.HashMap;

public class maxfreq {
    public static void main(String[] args) {
        
        int arr[] = { 1, 1, 2, 3, 7, 1, 2, 5, 7 };

        //make a hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        /*for (int i = 0; i < arr.length - 1; i++) {
            hm.put(arr[i], arr[i++]);                   Doing with Random approach
        }*/


        //Lets do it with the foreach approach

        for (int i : arr) {

            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
        }
        

        int max = -1, anskey = -1;
        

        for (var i : hm.entrySet()) {

            if (i.getValue() > max) {

                max = i.getValue();
                anskey = i.getKey();
            }
        }
        
        System.out.printf("%d key is occurs %d times so its is maximum",anskey,max);
        
        

    }
}
