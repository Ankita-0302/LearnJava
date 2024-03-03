// @FunctionalInterface
// interface A{
//     void show();
// }

// public class Demo{

//     public static void main(String a[]){
//         A obj=() -> System.out.println("in show");

//         obj.show();
//     }
// }

//===============================================================================================================
//Java Lambda Expression Example: Single Parameter

// @FunctionalInterface
// interface A{
//     void show(int i);
// }

// public class Demo{

//     public static void main(String a[]){
//         A obj=(i) -> System.out.println("in show"+i);

//         obj.show(8);
//     }
// }

//=====================================================================================================================
//

// @FunctionalInterface
// interface A{
//     void show(int i,int k);
// }

// public class Demo{

//     public static void main(String a[]){
//         A obj=(int i,int k) -> System.out.println("in show==="+k+" ,"+i);

//         obj.show(8,9);
//     }
// }


//==================================================================================================================
//Java Lambda Expression Example: with or without return keyword

@FunctionalInterface
interface C{
    int add(int i,int k);
}

public class Demo1{

    public static void main(String a[]){
        C obj=(int i,int k) -> i+k;

        int res=obj.add(8,9);
        System.out.println("result"+res);

    }
}