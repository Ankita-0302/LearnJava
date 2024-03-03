@Deprecated
class A{
    public void showTheData()
    {
        System.out.println("in A show");
    }
}class B extends A{
    @Override
    public void showTheData(){
      System.out.println("in B show");  
    }
}
public class Demo{
    public static void main(String a[]){
        B obj=new B();
        obj.showTheData();
    }
}