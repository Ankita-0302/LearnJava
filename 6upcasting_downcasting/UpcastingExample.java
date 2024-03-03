class Parents{
      void printData(){
        System.out.println("method of parents class");
    }
    void printData1(){
        System.out.println("method of parents1 class");
    }
}

class Child extends Parents{
    void printData(){
     System.out.println("method of child class");   
    }
    void printData2(){
        System.out.println("method of child2 class");   
       }
}
class UpcastingExample{
    public static void main(String args[]){

//upcasting
        Parents obj1=new Child();          //it will call the methods and work with parent class method
        obj1.printData();
        obj1.printData1();
        
//downcasting
        Parents obj2= new Child();  
        Child c=(Child)obj2;   
       c.printData();
       c.printData2();
         }
}