

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Eneter a number");
        int num=System.in.read();

        System.out.println(num-48);
    }
}
