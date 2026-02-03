public class PalindromeString {
    public static void main(String[] args) {
        String str="rtr";
        String rev="";
        String org_str=str;
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
    }
        if (org_str==rev){
            System.out.println(org_str+"- Is a Palindrome String.");
        }else {
            System.out.println(org_str+"- Is NOT a Palindrome String.");

        }
}
}