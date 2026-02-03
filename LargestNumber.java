public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={2,3,4,55,6,4,33,3,1};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
