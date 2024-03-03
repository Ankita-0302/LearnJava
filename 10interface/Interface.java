// *class-class->extends
// *class-interface->implements
// *interface-interface->extends


interface A {

    int age=44;              //by default  variables are final and static 
    String area="Mumbai";
    
    void show();
    void config();
}
interface X{
    void run();
}
class B implements A,X{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}
public class Interface{
    public static void main(String a[]){
        B obj ;
        obj=new B();
        obj.show();
        obj.config();
        obj.run();
        System.out.println(A.age);              //as age is a static variable directly access by the class name

    }
}