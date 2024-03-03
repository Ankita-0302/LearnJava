// class Human
// {
//     private int age=11;
//     private String name="Navin";

//     public Human(){                             //default constructor                  
//         age=12;
//         name="Ankita";
//     }
//     public Human(int age,String name){           //parametersized constructor
//      this.age=age;
//      this.name=name;
//     }
//      public Human(String name){           //parametersized constructor
//      this.name=name;
//     }
//     public int  getAge(){                      //getter 
//         return age;
//     }
//     public void setAge(int age){                //setter
//          this.age=age;                          //this
//     }
//     public String getName(){                   //getter
//         return name;
//     }
//     public void setName(String name){             //setter
//         this.name=name; 
//     }
// }
// public class Demo{
//     public static void main(String a[]){
//         Human obj =new Human();
//         Human obj1 =new Human();
//         Human obj2=new Human(12,"Anubhav");
//         Human obj3=new Human("Vivek");
//         obj.setAge(30);
//         obj.setName("reddy");
//         System.out.println(obj.getName()+":"+obj.getAge());
//         System.out.println(obj1.getName()+":"+obj1.getAge());
//         System.out.println(obj2.getName()+":"+obj2.getAge());
//         System.out.println(obj3.getName()+":"+obj3.getAge());
//     }
// }

//----------------------------------------------------------------------------------------------------------------------
class A{

public A(){
    System.out.println("object created");
}

public void show()
{
    System.out.println("in A show");
}
}
public class Demo{
    public static void main(String []args){

       new A().show();        //anonymous object
       new A().show();           //both tim new object is created
    }
}
