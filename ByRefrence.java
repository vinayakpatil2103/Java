class Students{
    int rollNo;
    String Name;
    void Info(int r,String n){
        this.rollNo=r;
        this.Name=n;
    }
    void Diplay(){
        System.out.println(rollNo+" "+Name);
    }

}

public class ByRefrence {
    public static void main(String[] args) {
        Students s=new Students();
        Students ss =new Students();
        s.Name="vinayk";
        s.rollNo=21;
        ss.Name="Dash";
        ss.rollNo=51;
        s.Diplay();
        ss.Diplay();
    }
}
