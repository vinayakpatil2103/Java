public class DuplicateElementInArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,3,2};
        System.out.print("Duplicate elements are : ");
        for (int i=0;i< arr.length;i++){
            for (int j=1+i;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
