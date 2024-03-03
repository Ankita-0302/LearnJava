package Iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Demo{
    public static void main(String a[]){
        Collection<Integer> nums=new HashSet<Integer>();                    //Set interface 
        nums.add(61);
        nums.add(5);
        nums.add(44);
        nums.add(21);
        nums.add(6);
        nums.add(5);
    
    Iterator<Integer> values=nums.iterator();
     while(values.hasNext()){
        System.out.println(values.next());
     }

        // for(int n:nums)
        // {
        //      System.out.println(n);
        // }

    }
}