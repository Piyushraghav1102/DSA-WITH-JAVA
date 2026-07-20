
import java.util.ArrayList;

public class linearrecur {
    static boolean linearecur(int nums[], int ind, int tar) {
        if (ind == nums.length)
            return false;

        if (nums[ind] == tar)
            return true;

        return linearecur(nums, ind + 1, tar);

    }

    static int linearecurIN(int nums[], int ind, int tar) {

        if (ind == nums.length)
            return -1;

        if (nums[ind] == tar)
            return ind;

        return linearecurIN(nums, ind + 1, tar);

    }

    static void Linearreucall(int nums[], int ind, int tar) {
        if (ind == nums.length - 1) {
            System.out.println(ind);
            return;
        }

        if (nums[ind] == tar) {
            System.out.println(ind);
        }
        Linearreucall(nums, ind + 1, tar);
    }

    static Arraylist<Integer> retarr(int nums[], int ind, int tar) {

        if (ind == nums.length - 1) {

        }

        if (nums[ind] == tar) {
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(ind);
            return a1;
        }

    }

    public static void main(String[] args) {

        int nums[] = { 2, 5, 6, 8, 3, 4 };
        int nums1[] = { 2, 2, 2 };

        // first method
        // if (linearecur(nums, 0, 8))
        // System.out.println("yes its found");

        // else
        // System.out.println("its not found");

        // 2nd method
        // System.out.println(linearecurIN(nums, 0, 8));

        // 3rd method
        // Linearreucall(nums1, 0, 2);

    }
}
