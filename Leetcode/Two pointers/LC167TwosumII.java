public class LC167TwosumII {
    
    public static int[] Caltwosum(int numbers[], int target) {
        
        
        // int n = numbers.length-1, low = 0, high = n;

        // int arr[] = new int[2];
        
        // while (low < high) {

        //     int currtarget = numbers[low] + numbers[high];

        //     if (currtarget == target) {
        //         arr[0] = low+1;
        //         arr[1] = high+1;
        //         break;
        //     } else if (currtarget >target)
        //         high--;
        //     else
        //         low++;

        // }
        // return arr;
        int low=0,high=numbers.length-1;

                int arr[]=new int[2];

                while(low<high){
                    int curr=numbers[low] + numbers[high];

                    if(curr==target){
                        arr[0]=low+1;
                        arr[1] = high+1;
                        break;
                    }
                    else if(curr>target){
                        high--;
                    }
                    else{
                        low++;
                    }
                }        
        return arr;
    }
    
    public static void main(String[] args) {
        
        int numbers[] = {2,7,11,15};
        
        int temp[]=Caltwosum(numbers, 9);

        for (int elem : temp) {
            System.out.print(elem+" ");
        }

    }
}
