package _17LVTI;

import java.util.Arrays;

// class var          //Error We can not use Var as class name 
// {

// }
public class Alien {

}

public class Demo {
    //var num=10;   ///error  we can not declare var here
    public static void main(String a[])
{
     int W=9;
//In as we are taking the type of variable at the time of compiulation that why it is not a 
//dynamic tpye language it is still statictly type language.

     var b=8;                  //var as a data type 
     String var="navin";       //we can use var as a variable also

     int c;
     //var d;                  //Error ,it is must to decalare the variable also

     int nums[]=new int[10];  //normal way in java but with var
     var Q =new int[8];
     Alien obj=new Alien();
     var obj1=new Alien();       //with var creating reference  object
  }

}