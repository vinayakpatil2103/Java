class employee{
    String name;
    long mob;
    int id;
    employee(String n, long m){
        this.name=n;
        this.mob=m;
    }
    employee(String n,long m,int id){
        this.name=n;
        this.mob=m;
        this.id=id;
    }

    void Details(){
        System.out.println(name +" "+mob+" "+id);
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
        employee e=new employee("vinayak",9421234);
        employee e1=new employee("Dash",982323,101);
        e.Details();
        e1.Details();
    }
}
