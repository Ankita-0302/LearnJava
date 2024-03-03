class A{

    public A()
    {      
           super();                                  //it will call the object of super class
           System.out.println("in A"); 
    }
    public  A(int i)
    { 
           this();                          //this will call the default constructor of the same class  
           System.out.println("in A int");
    }
}

class B extends A
{
        public B()
    {      super();                                                          // by default JVM will add this at the time of compilation 
           System.out.println("in B"); 
    }
    public  B(int i)
    {  
           super(i);
           System.out.println("in B int");
    }
}

public class SuperFunction{

    public static void main(String [] args){
            A obj=new A();
            System.out.println("---------------------------------------------------------------------------");

            B obj1=new B();
            System.out.println("---------------------------------------------------------------------------");

            B obj2=new B(6);
            System.out.println("now remove comment from superfunction and check again----------------------");
            
    }
}








