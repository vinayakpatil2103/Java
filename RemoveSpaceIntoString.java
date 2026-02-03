public class RemoveSpaceIntoString{
    public static void main(String[] args) {
        String str="Java    is   Programming  language.";
        String new_str=str.replaceAll("\\s", "");
        System.out.println("After Removing white spaces: "+new_str);
    }
}
