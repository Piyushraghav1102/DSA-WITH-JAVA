





public class Lc88mergesortarr {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
     
    
        
        // while (low != m && high != n) {
            
        //     if (nums1[low] < nums2[high]) {
        //         a1.add(nums1[low++]);
        //     }
        //     else if(nums1[low]>nums2[high]) {
        //         a1.add(nums2[high++]);
        //     }
        //     else{
        //         a1.add(nums1[low++]);
        //         a1.add(nums2[high++]);
        //     }
        // }
        // int i=0;
        // for (int elem : a1) {
        //     nums1[i++] = elem;
        // }
        
        int i = m - 1;        // last valid element in nums1
        int j = n - 1;        // last element in nums2
        int k = m + n - 1;    // last index of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // copy remaining elements of nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }


    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,0,0,0};
        int nums2[] = { 2, 5, 6 };
        
       

        merge(nums, nums.length, nums2, nums2.length);
    }
}
