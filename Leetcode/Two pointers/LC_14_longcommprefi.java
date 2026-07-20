public class LC_14_longcommprefi {

    public static  String longestCommonPrefix(String[] strs) {
        
        StringBuilder Longstr=new StringBuilder();

        String str1=strs[0];
        String str2=strs[strs.length-1];
        int index=0;

        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                Longstr.append(str1.charAt(index));
                index++;
            }
            else {
                break;
            }
        }
        return Longstr.toString();


    }
    
    public static void main(String[] args) {
    
        String arr[] = { "flower", "flow", "flight" };



        System.out.println(longestCommonPrefix(arr));

    }    
}
