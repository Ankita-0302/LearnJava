//we don't have default constructor in Record class
//all the variable in record is private and final because it is immutable data
//record class can not extends any other class because record class extends onlty a record class
//but you can implement interface as many as you want
//and you can define multiple method inside the record class,
//(you can create normal methods ,static methods and static variable as well)
// you cant not  create non static varible  in record it will give you error message "User declared non-static fields i are not permitted in a record"

package _19Record_Class;

// class Alien{
//     int id;
//     String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     public int getId() {
//         return id;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
    
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
// }

//if we are you a class which only holding the data means a data carrier type of class there we can use "record "

//record
record Alien(int id,String name){    
    static int num;
    int i;               //Error User declared non-static fields i are not permitted in a record
    public Alien{  //COMPACT CANONICAL CONSTRUCTOR
        if(id==0)
        throw new IllegalArgumentException("Id cannot be zero");
    }
    // public Alien(int id, String name) { //canonical constructor==========================

    //     if(id==0)              // for checking you can use this way  otherwise everthing was there with record
    //     throw new IllegalArgumentException("Id cannot be zero");
                
    //         }
            // public Alien(){   //A non-canonical constructor must start with an explicit invocation to a constructor
            //    // this(0,"");
            // }
            public void show(){

            }
}
public class Demo {
    public static void main(String[] args) {
        Alien a1=new Alien(0,"Ankit");  //exception error
        Alien a2=new Alien(1,"Ankita");
        // Alien a3=new Alien();  //their is no default construct in 


        System.out.println(a1);

        System.out.println(a1.equals(a2));

        System.out.println(a1.name());    //we can directly call the method withgout getter and setter 
    }
    
}
