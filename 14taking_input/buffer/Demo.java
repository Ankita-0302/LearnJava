import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
        
public class Demo{
        
    public static void main(String a[])throws IOException{
        
        System.out.println("Enter a number");
        
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        
        int num=Integer.parseInt(bf.readLine());
        
        System.out.println(num);
        
        bf.close();
    }
}