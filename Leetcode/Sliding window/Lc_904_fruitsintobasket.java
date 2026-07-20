
import java.util.HashMap;

public class Lc_904_fruitsintobasket {
    
    public static int totalFruit(int[] fruits) {

        int n = fruits.length;

        HashMap<Integer, Integer> h1 = new HashMap<>();

        int low = 0,maxlen=0;
        
        for (int high = 0; high < n; high++) {

            h1.put(fruits[high], h1.getOrDefault(fruits[high], 0) + 1);
            
            while (h1.size() > 2) {
                h1.put(fruits[low], h1.get(fruits[low])-1);

                if(h1.get(fruits[low])==0){
                    h1.remove(fruits[low]);
                }
                low++;
            }
            maxlen = Math.max(maxlen, high - low + 1);

        }
        return maxlen;
    }

    public static void main(String[] args) {
        int fruit[] = { 1, 2, 3, 2, 2 };
        
        System.out.println("Total no of fruits :-"+totalFruit(fruit));
    }
}