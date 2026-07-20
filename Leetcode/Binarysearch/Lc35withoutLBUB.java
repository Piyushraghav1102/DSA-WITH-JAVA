public class Lc35withoutLBUB {
    
        public static int findfirstoccur(int nums[],int tar){
            int n = nums.length;
     
             int first = -1;
     
             int low = 0, high = n - 1;
             while (low <= high) {
     
                 int mid = (low + high) / 2;
     
                 if (nums[mid] == tar) {
                     first = mid;
                     high = mid - 1;
                 } 
                 else if(nums[mid]<tar){
                    low = mid + 1;
                }
                else{
                   high=mid-1;
                }
             }
             return first;
        }

        public static int findlastoccur(int nums[], int tar) {
            int n = nums.length;

            int last = -1;

            int low = 0, high = n - 1;
            while (low <= high) {

                int mid = (low + high) / 2;

                if (nums[mid] == tar) {
                    last = mid;
                    low = mid + 1;
                } else if (nums[mid] < tar) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return last;
        }
      
        public static int[] searchRange(int[] nums, int target) {
            int n = nums.length; 
           int first=findfirstoccur(nums, target);
           int last = findlastoccur(nums, target);
            
           if (first == -1) {
               return new int[] { -1, -1 };
           }
            
           return new int[] { first, last };
        }

        public static void main(String[] args) {
        
            int nums[] = { 5, 7, 7, 8, 8, 10 };
            
            int arr[] = searchRange(nums, 8);

            for (int i : arr) {
                System.out.print(i+" ");
            }


    }
}
