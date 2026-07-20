

import java.util.ArrayList;
import java.util.List;

public class Findpermutation {
    
    
    public static void Printarrstr(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void Printarrnum(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    
    public static int[] swap(int nums[], int i, int ind) {
        
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
        return nums;
    }

    public static void findpermutation(String str, String ans) {
        
        if (str.length() == 0) {
           // Printarr(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i + 1);
            findpermutation(newstr, ans+ch);
    
        }
    }

    public static void helper(int nums[],int ind,List<List<Integer>> ans) {
        
        if (ind == nums.length-1) {
            List<Integer> l = new ArrayList<>();
            for (int elem : nums) {
                l.add(elem);
            }
            ans.add(l);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
        
            swap(nums, i, ind);
            helper(nums, ind+1, ans);
            swap(nums, i, ind);
        }
}

    public static List<List<Integer>> Findpermutation(int nums[]) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        //findpermutation(str1, "");


        int arr[] = { 1, 2, 3, };
        

        List<List<Integer>> l1=Findpermutation(arr);

        System.out.println(l1);


    }
}
