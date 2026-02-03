public class EvenAndOddNumberArray {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,6,7};
        System.out.println("Even numbers in an array: ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers in an array: ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
