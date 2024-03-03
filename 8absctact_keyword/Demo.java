//we can not create the object of abstract class,we have to override all the object of parents class into child class


abstract class Car{
    public abstract void drive();
    //public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }
}

class wagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }

}

public class Demo{
    public static void main(String a[]){
    Car obj=new wagonR();
    obj.drive();
    obj.playMusic();
    }
}





























