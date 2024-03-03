package Mapp;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String a[]){
   Map<String,Integer> students= new HashMap<>();

   students.put("navin",56);
   students.put("Harsh",23);
   students.put("Sushil",4);
   students.put("Kiran",5);
   students.put("Ankita",8);
   students.put("Harsh",40);

   System.out.println("==============================================================");
   System.out.println(students);

   System.out.println("==============================================================");
   System.out.println(students.get("Harsh"));

   System.out.println("==============================================================");
   System.out.println(students.keySet());
   
   System.out.println("==============================================================");
   for(String key:students.keySet()){
    System.out.println(key +":"+students.get(key));
   }

   }
}
