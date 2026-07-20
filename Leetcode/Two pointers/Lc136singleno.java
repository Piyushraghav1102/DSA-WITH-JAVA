public class Lc136singleno{
    
    public static int singleNumber(int[] nums) {
    
        int n = nums.length;

        int xor = 0;

        for (int elem : nums) {
            xor ^= elem;
        }
        return xor;
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3 };

        System.out.println(singleNumber(nums));
    }    
}