import java.util.ArrayList;
//import java.util.StringBuilder;



public class Zig_Zag {
    public static void main(String[] args) {
        String  str="PAYPALISHIRING";
        int r=3;

        Solution sol= new Solution();
        String k=sol.convert(str, r);
        System.out.println(k);
    }
    
}

class Solution{
    public String convert(String s,int r){
        if(r==1 || s.length() <r)
        return s;

        ArrayList<StringBuilder> al=new ArrayList<>();
        int k=0;
        for(int i=0;i<r;i++)
            al.add(new StringBuilder());

            boolean down =false;
            for(char c: s.toCharArray()){
                al.get(k).append(c);
                if(k==0 || k== r-1)
                down=!down;
                k += down?1:-1;
        }

        StringBuilder st=new StringBuilder();
        for(StringBuilder str:al)
            st.append(str);
            return st.toString();    
    }
}
