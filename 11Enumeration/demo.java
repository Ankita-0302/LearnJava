//you can't extend enum in any other class

enum Status{
    Running,Failed,Pending,Success;
}

public  class demo{
    public static void main(String a[]){
      //  int i=5;
        Status s=Status.Running;                                   //same way as it was for i status is a type s is variable
        System.out.println(s);

        //ordinal method use
        System.out.println(s.ordinal());                           //it will give you the index number

        //values method use
        Status ss[]=Status.values();              //it will return you all the values in the array form 
        System.out.println(ss);                    //it will print address                      

        for(Status k:ss){                        //enhanced loop
        System.out.println(k+"="+k.ordinal());                   //it will return you the the value of enum at every index
        }
        
        //if else use
        if(s==Status.Running)
        System.out.println("All Good");
        else if(s==Status.Failed)
        System.out.println("Try Again");
        else if(s==Status.Pending)
        System.out.println("Please wait");
        else
        System.out.println("Done");

        //Switch use
        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
            default:
                System.out.println("Done");
        }


        //super class is enum
        System.out.println(s.getClass().getSuperclass());
    }
}

