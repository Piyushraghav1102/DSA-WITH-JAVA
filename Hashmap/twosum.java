
import java.util.HashMap;

public class twosum {
    
    public static int[] Findtwosum(int arr[],int tar) {
    
        int arr2[] = { -1 };

        HashMap<Integer,Integer> h1=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int findtar = tar - arr[i];

            if (h1.containsKey(findtar)) {
                arr2 = new int[] { i, h1.get(findtar) };
                return arr2;
            }
            h1.put(arr[i], i);

        }
        return arr2;

}

    public static void main(String[] args) {
        
        int arr[] = { 1, 5, 7, -1 };
    
        int arr2[] = Findtwosum(arr, 6);

        for (Integer i : arr2) {
            System.out.println(i);
        }
    

    }
}
