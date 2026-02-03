class Method{
    int runs;
    String player;

   public void Displayy(){
       System.out.println(runs+"  "+player );
    }
}

public class Methods {
    public static void main(String[] args) {
        Method m1=new Method();
        m1.runs=41;
        m1.player="Gill";
        m1.Displayy();
    }
}
