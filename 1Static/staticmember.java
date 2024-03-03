//static member

class Mobile
{
    String brand;
    int price;
    static String name;               //static only one time memory allocation is doneand all object will share it 

public void show(){

    System.out.println(brand+":"+price+":"+name);

}
}
public class staticmember{
    public static void main(String a[]){
      Mobile obj1=new Mobile();
      obj1.brand="Apple";
      obj1.price=1500;
      Mobile.name="smart phn";                    //static variable is access by class name 

        Mobile obj2=new Mobile();
      obj2.brand="Samsung";
      obj2.price=1700;
      Mobile.name="smart phn";

      Mobile.name="phone";                       //value is changed for all object

      obj1.show();
      obj2.show(); 
}
}

//-------------------------------------------------------------------------------------------------------------------
//static Block :-static block is start with static keyword and it is used to initialse the value of datamemder
// at the starting of the program
//static function is loaded firt at the time of class loading

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;               //static only one time memory allocation is doneand all object will share it 

// public Mobile(){
//     brand="";
//     price=200;
//     System.out.println("in constructor");
// }
// static{
//     name="phone";
//     System.out.println("in a ststic block");
// }
// public void show(){

//     System.out.println(brand+":"+price+":"+name);

// }
// }
// public class staticmember{
//     public static void main(String a[]){

//       Mobile obj1=new Mobile();
//         Mobile obj2=new Mobile();
   
// }
// }

//----------------------------------------------------------------------------------------------------------------------
//speacial class Class.forName("classname"); use this if you want to load a class without objection creation
// class Mobile
// {
//     String brand;
//     int price;
//     static String name;               //static only one time memory allocation is doneand all object will share it 

// public Mobile(){
//     brand="";
//     price=200;
//     System.out.println("in constructor");
// }
// static{
//     name="phone";
//     System.out.println("in a ststic block");
// }
// public void show(){

//     System.out.println(brand+":"+price+":"+name);

// }
// }
// public class staticmember{
//     public static void main(String a[]) throws ClassNotFoundException{
//       Class.forName("Mobile");
// }
// }

//-----------------------------------------------------------------------------------------------------------------------
//point to remember
//with class name we can call static method
//static method can only access static datamember
//but by passing object reference we can use the datamembers in static method

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;               //static only one time memory allocation is doneand all object will share it 

// public void show(){

//     System.out.println(brand+":"+price+":"+name);

// }
// public static void show1(Mobile obj){
//       System.out.println("static function");
//      System.out.println(obj.brand+":"+obj.price+":"+obj.name);
// }
// }
// public class staticmember{
//     public static void main(String a[]){

//          Mobile obj1=new Mobile();
//       obj1.brand="Apple";
//       obj1.price=1500;
//       Mobile.name="smart phn";                    //static variable is access by class name 

//         Mobile obj2=new Mobile();
//       obj2.brand="Samsung";
//       obj2.price=1700;
//       Mobile.name="smart phn";

//       Mobile.name="phone";                       //value is changed for all object

//       obj1.show();
//       obj2.show(); 
//       Mobile.show1(obj1);
//       }
// }

//in java we create a main methos as static because static metod 
// The static is a keyword which we use in the main() method to define it as static. There is no object of the class available at the time of starting java runtime, and because of that, we have to define the main() method as static. By doing that, JVM can load the class into the main memory and call the main() method.
// So, if we define main() method as non-static method, JVM would not be able to call it and throws the following error:
// Main method is not found.
// as we know when class is loaded then is automatically call the static function without an object