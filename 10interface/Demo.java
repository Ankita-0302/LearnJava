// class Laptop{
//     public void code(){
//         System.out.println("code ,compile:run");
//     }
// }

// class Desktop{
//     public void code(){
//         System.out.println("code ,compile:Fast");
//     }
// }
// class Developer{

//     public void devApp(Laptop lap)              //this line is creating a fixation that we have to pass laptop object only 
//                                                 //because of this interface is required
//     {
//         //System.out.println("coding..");
//         lap.code();
//     }
// }
// public class Demo{
//     public static void main(String a[]){

//     Laptop lap=new Laptop();
//     Desktop desk=new Desktop();

//     Developer navin=new Developer();
//     navin.devApp(lap);
//     }
// }

//------------------------------------------------------------------------------------------------------------------
//generlasition

// class Computer{
//     public void code(){

//     }
// }
// class Laptop extends Computer{
//     public void code(){
//         System.out.println("code ,compile:run");
//     }
// }

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("code ,compile:Fast");
//     }
// }
// class Developer{

//     public void devApp(Computer lap)            
                                                
//     {
//         //System.out.println("coding..");
//         lap.code();
//     }
// }
// public class Demo{
//     public static void main(String a[]){

//     Computer lap=new Laptop();
//     Computer desk=new Desktop();

//     Developer navin=new Developer();
//     navin.devApp(lap);
//     navin.devApp(desk);

//     }
// }


//=============================================================================================================
//do same with abstract keyword
// abstract class Computer{
//      public abstract void code();
// }
// class Laptop extends Computer{
//     public void code(){
//         System.out.println("code ,compile:run");
//     }
// }

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("code ,compile:Fast");
//     }
// }
// class Developer{

//     public void devApp(Computer lap)            
                                                
//     {
//         //System.out.println("coding..");
//         lap.code();
//     }
// }
// public class Demo{
//     public static void main(String a[]){

//     Computer lap=new Laptop();
//     Computer desk=new Desktop();

//     Developer navin=new Developer();
//     navin.devApp(lap);
//     navin.devApp(desk);

//     }
// }

//=======================================================================================================
//interface


interface  Computer{
     public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code ,compile:run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code ,compile:Fast");
    }
}
class Developer{

    public void devApp(Computer lap)            
                                                
    {
        //System.out.println("coding..");
        lap.code();
    }
}
public class Demo{
    public static void main(String a[]){

    Computer lap=new Laptop();
    Computer desk=new Desktop();

    Developer navin=new Developer();
    navin.devApp(lap);
    navin.devApp(desk);

    }
}