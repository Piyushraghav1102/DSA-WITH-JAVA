public class Lc11_containmostwater {

    public static int mostwater(int height[]) {
        int n = height.length;
        int maxwater = 0;

        for (int left = 0; left < n; left++) { // this is count the left bar
            for (int right = left + 1; right < n; right++) {

                int width = right - left;
                int minbar = Math.min(height[left], height[right]); // it will count left and right bars which is small bar

                int waterstore = width * minbar; // kitna pani ekhata ho rha hai bars ke beech mai

                maxwater = Math.max(waterstore, maxwater); // sabse se konsa pani jyada ekhata kr rha h
            }
        }
        return maxwater;

    }

    public static int optimisedmostwater(int height[]) {
        
        int right = height.length - 1;
        int left = 0;
        int maxwater = 0;

        while (left < right) { // two pointer approach

            int width = right - left;
            int minbar = Math.min(height[left], height[right]); // it will count left and right bars which is smallbar

            int waterstore = width * minbar; // kitna pani ekhata ho rha hai bars ke beech mai

            maxwater = Math.max(waterstore, maxwater); // sabse se konsa pani jyada ekhata kr rha h
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxwater;
    }

    public static void main(String args[]) {

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 1, 7 };

        System.out.println("Maximum water store in bars :- " + mostwater(height));
    }
}