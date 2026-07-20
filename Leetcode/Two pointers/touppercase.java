public class touppercase {

    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));// first character ko capital kra

        // then usko append kr diya string builder ke object sb mai
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
                sb.append(str.charAt(i)); // for character

                if (count > 1) {
                    count.toString();
                    sb.append(str.charAt(count)); // for count after character
                }

            }
        }
        return sb.toString();

    }

    public static void main(String args[]) {

        String str = "aaabbvvvxxx";
        // System.out.println(uppercase(str));
        System.out.println(compress(str));
    }
}
