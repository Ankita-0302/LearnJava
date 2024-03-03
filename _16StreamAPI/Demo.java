package _16StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String a[]){
    List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    
    Stream<Integer> s=nums.stream()
                         .filter(n->n%2==0)
                         .sorted();         //==================================

    s.forEach(n-> System.out.println(n));
     //


     //parallelStream() function will create a multiple thread to mke the task more faster=========
    //Stream=====================================================================
    // Stream<Integer> s1=nums.stream();
    // Stream<Integer> s2=s1.filter(n->n%2==0);
    // Stream<Integer> s3=s2.map(n->n*2);
    // int result=s3.reduce(0,(c,e)-> c+e);
    // System.out.println(result);
    
    //shorthand foir stream=======================================================
    // int result=nums.stream()
    //               .filter(n->n%2==0)
    //               .map(n->n*2)
    //               .reduce(0,(c,e)->c+e);
    //               System.out.println(result);

    //Predicate============================================
    // Predicate<Integer> p=new Predicate<Integer>(){
    //     public boolean test(Integer n){
    //         if(n%2==0)
    //             return true;
    //         else 
    //             return false;
    //     }
//};
    //shorthand fopr Predicated==============================
    // Predicate<Integer> p=n->n%2==0;

    //Map======================================================
// Function<Integer,Integer> fun=new Function<Integer,Integer>(){
//     public Integer apply(Integer n){
//         return n*2;
//     }
// };
    //shorthand of map========================================
    // Function<Integer,Integer> fun=n->n*2;
        
    
    // int result=nums.stream()
    // .filter(p)
    // .map(fun)
    // .reduce(0,(c,e)->c+e);
    // System.out.println(result);


    //simple for loop==============================================================
    // for(int  i=0;i<nums.size();i++){
    //     System.out.println(nums.get(i));
    // }

    //enhanced for loop============================================================
    // for(int n:nums){
    //     System.out.println(n);
    // }

    //foreach======================================================================
    // nums.forEach(n->System.out.println(n));
    

    //since consumer interface has only one fuction so we can reduce the equation==================================
    // Consumer<Integer> con=new Consumer<Integer>(){
             
    //     public void accept(Integer n){
    //         System.out.println(n);
    //     }
    // };
    // nums.forEach(con);

    //short hand=================================================================
    // nums.forEach(n->System.out.println(n));
     
    //=============================================================================
    // int sum = 0;
    // for(int n:nums){
    // if (n%2==0){
    //     n=n*2;
    //     sum=sum+n;
    // }
    // }
    // System.out.println(sum);
   }
}
