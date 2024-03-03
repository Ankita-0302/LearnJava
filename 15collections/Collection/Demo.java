package Collection;

import java.util.ArrayList;
import java.util.Collection;
public class Demo{
    public static void main(String a[]){
        Collection<Integer> nums=new ArrayList<Integer>();                    //collection interface
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(2);

        for(int n:nums)
        {
            System.out.println(n);
        }

        System.out.println(nums);
    }
}