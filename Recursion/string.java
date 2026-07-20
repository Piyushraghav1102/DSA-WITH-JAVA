
import java.util.ArrayList;

public class string {

    static ArrayList<String> Genstrseq(String s) {

        ArrayList<String> ans = new ArrayList<>();

        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }

        char curr = s.charAt(0);

        ArrayList<String> smallans = Genstrseq(s.substring(1));

        for (String ss : smallans) {

            smallans.add(ss); // bc,b,c," "

            smallans.add(curr + ss); // +a in front of combination
            // abc,ab,ac,a
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<String> s = Genstrseq("ABC");

        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
