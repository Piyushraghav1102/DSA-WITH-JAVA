public class Lc125Validpalin {
    
    //public static boolean Validpalindrome(String s) {
        
    //     int n=s.length()-1;

    //     int low = 0, high = n;

        
    //     while (low < high) {

    //         if (!Character.isLetterOrDigit(s.charAt(low)))
    //             low++;

    //         else if (!Character.isLetterOrDigit(s.charAt(high)))
    //             high--;

    //         else {
    //             if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
    //                 return false;
    //             }
    //             low++;
    //             high--;
    //         }
    //     }
    // return true;

   // } 
    

    public static boolean Validpalindrome(String s) {
        int n=s.length()-1;
        int low = 0;
        int high =n;

        while (low < high) {
           
            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
            else {
                if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                    return false;
                }
                low++;
                high--;
            }
        }
        
        
        return true;
    }
    public static void main(String[] args) {
        
        //String str = "amanaplanacanalpanama";
        
        String str = "A man, a plan, a canal: Panama";

        System.out.println(Validpalindrome(str));
    }
}
