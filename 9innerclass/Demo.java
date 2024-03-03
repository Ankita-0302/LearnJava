class A{
 int age;

 public void show(){
System.out.println("in show");
 }
 class B{

    public void config(){
        System.out.println("in config");
    }
 }

 static class C{                        //static class

    public void fig(){
        System.out.println("in fig");
    }
 }
}

public class Demo{

    public static void main(String a[]){
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();                            //inner class calling
        obj1.config();

        A.C obj2=new A.C();                              //inner static class calling
        obj2.fig();
    }
}

