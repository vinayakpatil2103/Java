public class SumOfElementArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7};
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements of an array is : "+sum);
    }
}
