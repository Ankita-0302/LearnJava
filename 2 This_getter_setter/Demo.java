//getter and setter
// class Human
// {
//     private int age=11;
//     private String name="Navin";

//     public int  getAge(){                      //getter 
//         return age;
//     }
//     public void setAge(int a){                //setter
//          age=a;
//     }
//     public String getName(){                   //getter
//         return name;
//     }
//     public void setName(String n){             //setter
//         name=n; 
//     }
// }
// public class Demo{
//     public static void main(String a[]){
//         Human obj =new Human();
//         obj.setAge(30);
//         obj.setName("reddy");
//         System.out.println(obj.getName()+":"+obj.getAge());
//     }
// }
//-------------------------------------------------------------------------------------------------------------------
//this keyword

class Human
{
    private int age=11;
    private String name="Navin";

    public int  getAge(){                      //getter 
        return age;
    }
    public void setAge(int age){                //setter
         this.age=age;
    }
    public String getName(){                   //getter
        return name;
    }
    public void setName(String name){             //setter
        this.name=name; 
    }
}
public class Demo{
    public static void main(String a[]){
        Human obj =new Human();
        obj.setAge(30);
        obj.setName("reddy");
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}