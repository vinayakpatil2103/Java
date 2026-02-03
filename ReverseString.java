public class ReverseString {
    public static void main(String[] args) {
        String str="vinayak";
        String rev="";
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if (str==rev){
            System.out.println(str+" is palindrome String.");
        }else {
            System.out.println(str+" is not palindrome String.");
        }
    }
}
