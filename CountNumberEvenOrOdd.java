public class CountNumberEvenOrOdd {
    public static void main(String[] args) {
        int num=1234;
        int oddNum=0;
        int evenNum=0;
        while (num>0){
            int rem=num%10;
            if (rem % 2 == 0) {
                evenNum++;
            }else {
                oddNum++;
            }
            num=num/10;
        }
        System.out.println("Number of Even numbers : "+evenNum);
        System.out.println("Number of Odd number : "+oddNum);
    }
}
