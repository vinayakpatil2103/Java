public class Rotate_Number {
    public static void main(String[] args) {
        int num=12345;
        int last =num%10;
        num/=10;
        int count=0;
         for (int i=num;i>0;i/=10){
             count++;
         }
         int pow=1;
         for (int i=0;i<count;i++){
             pow=pow*10;

         }
         int ans=(last*pow)+num;
        System.out.println(ans);

    }
}
