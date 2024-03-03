//creating own class enum
//for different object different valuues is saved
//we are using it as a private constructor not a default or public constructor it is because we are 
//creating the object in the same class
enum Laptop{
    Macbook(2000),Xps(2200),Surafce(1500),ThinkPad(1800);    //it is constuctor call through each objectobject
    
    private int price;
    
    private Laptop(int price){  //parameterised constructor
        this.price=price;
    }

    public void setPrice(int price){
        this.price=price;
    }
    
    public int  getPrice(){
        return price;
    }

    private Laptop(){       //default constructor
        price=500;
    }
    
}

public class Demo1{

    public static void main(String a[]){
    
    // Laptop lap=Laptop.Macbook;
    // System.out.println(lap +"=="+lap.getPrice());
    // System.out.println(lap.getPrice());

    for(Laptop lap:Laptop.values())
    {
        System.out.println(lap+"==>"+lap.getPrice());
    }
    }
}