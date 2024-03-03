package Method_hiding;

class Parent{
    public static void show(){
        System.out.println("Inside parent class");
    }
}

class Child extends Parent{
    public static void show(){
        System.out.println("Inside child class");
    }
}
public class Demo {

    public static void main(String a[]){
         Parent p=new Parent();
         p.show();

         Parent c=new Child();
         c.show();
    }
    
}
