import java.util.Arrays;

public class longestcommonprefix {

    public static String findloString(String strs[]) {

        StringBuilder res = new StringBuilder(); // String builder can edit String with itself with apeend method

        Arrays.sort(strs);
        char Str1[] = strs[0].toCharArray(); // In str1 first string will store "Flower"
        char Str2[] = strs[strs.length - 1].toCharArray(); // Last string will store "Flight"

        for (int i = 0; i < Str1.length; i++) {

            // now we comapre this to first char to End char in both String

            if (Str1[i] == Str2[i]) {
                res.append(Str1[i]);
            } else {
                break;
            }

        }
        return res.toString();
    }

    public static int presuffinString(String[] chars) {

        int count = 0;
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String str1 = chars[i];
                String str2 = chars[j];
                if (str1.startsWith(str2) && str2.endsWith(str2)) {
                    count++;
                }

            }
            return count;
        }
        return n;
    }

    public static void main(String args[]) {

        String strs[] = { "flower", "flow", "flight" };

        System.out.print(findloString(strs));
    }
}
