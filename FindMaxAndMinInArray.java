public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int arr[]={20,30,40,50,80,10};
        int max=arr[0];
        int min=arr[0];

        for (int i=1;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in an array is : "+min);
        System.out.println("Maximum element in an array is : "+max);
    }
}
