package comparatorr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String a[]){

        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j)
            {
                if(i%10>j%10)
                return 1;
                else return -1;
            }
        };
         List<Integer> nums=new ArrayList<>();
         nums.add(45);
         nums.add(37);
         nums.add(72);
         nums.add(91);

         Collections.sort(nums,com);

         System.out.println(nums);

    }
}
