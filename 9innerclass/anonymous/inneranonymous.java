class A{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class inneranonymous{
    public static void main(String a[]){
        A obj=new A()                              //just befor semi colon anonymous class declare  and defined
        {

        };                                         // after that semi colon
        obj.show();
    }
}


