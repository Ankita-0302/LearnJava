public class WrapperDemo{
    public static void main(String []args){
        int num=2;

//      Integer num1=new Integer(num);   // boxing,converting int into Integer explicitly 

        Integer num1=num;                //autoboxing, now compiler will write Integer.valueOf(a) internally  
        System.out.println("auto boxing-: "+num1);

        // int num2=num1.intValue();                    //unboxing,converting Integer to int explicitly  
        // System.out.println("unboxing-:"+num2);

        int num2=num1;          //auto-unboxing ,unboxing, now compiler will write a.intValue() internally    
        System.out.println("auto-unboxing-:"+num2);

 System.out.println("-----------------------------------");

        String str="12";
        int num3=Integer.parseInt(str);   //parseInt method to convert int into number
        System.out.println(num3*2);
    }
}