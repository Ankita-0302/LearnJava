package List;

import java.util.ArrayList;
import java.util.List;
public class Demo{
    public static void main(String a[]){
        List<Integer> nums=new ArrayList<Integer>();                    //List interface 
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(2);
                                                      // we will get index value with List 
        System.out.println(nums.indexOf(5));
        System.out.println(nums.get(2));

    }
}