public class Lc443 {
    
    public static int compress(char[] chars) {

        int n = chars.length;


        int i = 0;//for the write;
        int j = 0;//for the read;

        while (j < n) {
            char current = chars[j];
            int count = 0;

            while (j < chars.length && chars[j] == current) {
                j++;
                count++;
            }

            chars[i++] = current;//store firstly character

            if (count > 1) {
                
                    String num = String.valueOf(count);
                    for (char c : num.toCharArray()) {
                        chars[i++] = c;
                    }
                
            }

        }
        return i;
    }
    public static void main(String[] args) {
    
            String arr[] = { "a", "a", "b", "b", "c", "c", "c" };
            
            char[] chArr = new char[arr.length];
    
            for (int i = 0; i < arr.length; i++) {
                chArr[i] = arr[i].charAt(0);
            }
    
            System.out.println(compress(chArr));

            for (char ch : chArr) {
                System.out.print(ch + " ");
            }
        }
    }

