
import java.util.HashSet;

public class longestconsecutive {
    
    
    public static int FindLC(int arr[]) {

        HashSet<Integer> hs = new HashSet<>();

        for (Integer i : arr) { //Firstly we add the data in the set
            hs.add(i);
        }

        //Then we check the lonmgest consecutive in the set

        int max = Integer.MIN_VALUE;

        for (Integer num : hs) {

            if (!hs.contains(num - 1)) {
                //if its true so the current num is starting point 

                int curr = num;
                int longlength = 1;

                while (hs.contains(num + 1)) {
                    longlength++;
                    curr++;
                }
                max = Math.max(longlength, max);
            }

        }
        return max;
    }
    
    public static void main(String[] args) {
    
        int arr[] = { 99, 1, 100, 4, 200, 1, 2, 2, 3 };
        longestconsecutive l1 = new longestconsecutive();

        System.out.println(" This is the logest consecutive no :- "+l1.FindLC(arr));

    }
}
