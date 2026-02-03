class Student{
    String name;
    int rollNo;
    static String collageName="YMIM";

    Student(String n,int r){
        this.name=n;
        this.rollNo=r;
    }

    void Display(){
        System.out.println("Name: "+name+" RollNumber: "+rollNo+" collageName: "+collageName);
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student("Vinayak",21);
        Student s2=new Student("Dash",22);
        s1.Display();
        s2.Display();
    }
}
