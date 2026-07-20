public class Lc744{
    
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        int low = 0, high = n - 1;
        char ans='\0';

        while (low <= high) {
            int mid = (low + high) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans == '\0' ? letters[0] : ans;
    }
    
    public static void main(String[] args) {
        
        char letters[] = { 'c', 'f', 'g' };

        System.out.println("This is the smallest no :-"+nextGreatestLetter(letters, 'a'));

    }
}