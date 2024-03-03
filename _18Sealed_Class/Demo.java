package _18Sealed_Class;
//we can extends and implements the seal class 
//we can  use keyword sealed and give the permits to the classes who can extend the can further
//coplusory,subclass can be sealed ,non-sealed ,Final otherwise it will give error
//sealed class must have subclasses
sealed class A extends Thread implements Cloneable permits B,C{

}

non-sealed class B extends A{

}

final class C extends A{          //subclass C must extend sealed class

}

class D extends B{

}

sealed interface X permits Y{

}
non-sealed interface Y extends X{

}

public class Demo {
    public static void main(String[] args) {
        
    }
}
