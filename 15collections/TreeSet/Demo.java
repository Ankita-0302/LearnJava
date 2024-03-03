package TreeSet;

import java.util.Set;
import java.util.TreeSet;
public class Demo{
    public static void main(String a[]){
        Set<Integer> nums=new TreeSet<Integer>();                    //Set interface 
        nums.add(61);
        nums.add(5);
        nums.add(44);
        nums.add(21);
        nums.add(6);
        nums.add(5);
                                                      // value will not repeat,and in sorted order
        for(int n:nums)
        {
             System.out.println(n);
        }

    }
}