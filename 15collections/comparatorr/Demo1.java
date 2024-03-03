package comparatorr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  
{
    int age;
    String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
}

public class Demo1 {
    public static void main(String a[]){

        Comparator<Student> com=(i, j) -> i.age>j.age? 1 :-1;
        
         List<Student> studs=new ArrayList<>();
         studs.add(new Student(45,"Navin"));
         studs.add(new Student(5,"Ankita"));
         studs.add(new Student(35,"Vivek"));
         studs.add(new Student(55,"Ankit"));

         Collections.sort(studs,com);
         
         for(Student s:studs){
         System.out.println(s);
         }

    }
}
