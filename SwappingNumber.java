public class SwappingNumber {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int temp;
        //Method 1
//        System.out.println("Before Swapping :"+"a= "+a+" b= "+b);
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping :"+"a= "+a+" b= "+b);

        //Method 2
        System.out.println("Before Swapping :"+"a= "+a+" b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping :"+"a= "+a+" b= "+b);

    }
}
