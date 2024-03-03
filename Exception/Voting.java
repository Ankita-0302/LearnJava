import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg){
        super(msg);
    }
}

class Voting{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Eneter Your Age");

        int age=s.nextInt();
        try{
        if(age<18){
            throw new YoungerAgeException("you are not eligible");
        }
        else{
            System.out.println("you are eligible  ");
        }
    }
    catch(YoungerAgeException e){
        e.printStackTrace();
    }
    System.out.println("hello");
    }
}