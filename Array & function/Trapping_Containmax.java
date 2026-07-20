public class Trapping_Containmax{

    public static int trappingwate(int[] height) {
        int n = height.length;
        // auxiliary array
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            // for calculate Leftmax bar
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // for calculate rightmax bar
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapped = 0;
        // For calcualate trapped water
        for (int i = 0; i < n; i++) {
            int waterlev = Math.min(rightmax[i], leftmax[i]);

            trapped += (waterlev - height[i]);
        }

        return trapped;
    }

    public static int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = height[0];
        right[n - 1] = height[n - 1];

        int trappedwater = 0;

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(right[j+1], height[j ]);
        }

        for (int i = 0; i < n; i++) {
            trappedwater += (Math.min(right[i], left[i]) - height[i]);
        }
        return trappedwater;
    }
    
    public static int Containmax(int arr[]) {

        int n = arr.length - 1;

        int left = 0, right = n;

        int maxwater = Integer.MIN_VALUE;

        while (left <= right) {

            int minheight = Math.min(arr[left], arr[right]);

            int currwater = (right - left) * minheight;

            maxwater = Math.max(currwater, maxwater);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxwater;
    }

    public static int maxArea(int[] height) {
        int n = height.length;

        int left = 0, right = n - 1;

        int maxwater=Integer.MIN_VALUE;
        while (left <=right)
        {
            int minheight = Math.min(height[left], height[right]);

            int currwater = (right-left) * minheight;

            maxwater = Math.max(currwater, maxwater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    
    }

    public static void main(String args[]) {

        //int height[] = { 2, 3, 4, 6, 2, 5, 18 };

        int height[] = { 0,1,0,2,1,0,1,3,2,1,2,1 };

        System.out.println("Maximum water is :- " + trap(height));
        
        
    }
}
