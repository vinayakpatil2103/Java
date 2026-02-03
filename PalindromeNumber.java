public class PalindromeNumber {
    public static void main(String[] args) {
        int num=123;
        int rev=0;
        int org_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev){
            System.out.println(org_num+" - Number is Palindrome.");
        }else {
            System.out.println(org_num+" - Number is NOT Palindrome.");

        }
    }
}
