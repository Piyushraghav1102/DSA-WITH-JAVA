

public class LC344Reversestr {
    
    public static char[] Reversestr(char str[]) {

        int n = str.length-1;

        int low = 0, high = n;

        while (low < high) {

            char temp = str[high];
            str[high] = str[low];
            str[low] = temp;

            low++;
            high--;
        }
        return str;
    }
    
    public static void main(String[] args) {
    
        char Str[] = { 'H', 'E', 'L', 'L', 'O' };
        
        char arr2[] = Reversestr(Str);
       
        for (char c : arr2) {
            System.out.print(c+" ");
        }
    }
}
