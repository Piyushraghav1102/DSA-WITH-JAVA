public class inpsort {
    
    public static Boolean checkarrsort(int arr[]) {
        
        int n = arr.length;
        boolean flag=false;
        
        for (int i = 1; i < n; i++) {
            if (arr[i-1] < arr[i ]) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
    
        int nums[] = { 1, 2, 3, 9, 5 };

        System.out.println("Is this array sorted :- "+checkarrsort(nums));

    }
}
