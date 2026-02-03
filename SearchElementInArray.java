public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int searchEle=30;
        boolean flag=false;
        for (int i=0;i< arr.length;i++){
            if (searchEle==arr[i]){
                System.out.println("Element found at index : "+i);
                flag=true;
                break;
            }
        }
        if (flag=false){
            System.out.println("Element NOT found : ");
        }
    }
}
