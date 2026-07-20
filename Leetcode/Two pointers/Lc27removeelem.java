public class Lc27removeelem {
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;

        int i=0;
        
        
        for(int k=0;k<n;k++){
            if(nums[k]!=val){
                nums[i]=nums[k];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};

        System.out.println("Count the no :- "+removeElement(arr, 2));
    }
}
