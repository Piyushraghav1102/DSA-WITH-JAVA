public class Lc345revvowels {
   
   
    public static Boolean isvowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
   
   public static String reverseVowels(String s) {
    int n = s.length();

    int high = n - 1, low = 0;
    char arr[] = s.toCharArray();

    while(low<high){

        if (isvowel(arr[low]) && isvowel(arr[high])) {
            
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
         }
        else if (!isvowel(arr[low])) {
            low++;
        }
        else{
            high--;
     }
     
    }
    return  new String(arr);
   }
    public static void main(String[] args) {
        String str = "Leetcode";
        System.out.println(reverseVowels(str));
    }
}
