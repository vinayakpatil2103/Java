public class OcuurenceOfCharater {
    public static void main(String[] args) {
        String str="Java Programming";
        int total_count=str.length();
        int total_count_after_removing=str.replace("P","").length();
        int count=total_count-total_count_after_removing;
        System.out.println("Number of Occurance 'a' is : " +count);
    }
}
