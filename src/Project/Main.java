package Project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1="Harry";
        String s2="Sally";

        int longestChild = 0;
        int subLength=0;
        boolean[] isTrue = new boolean[s1.length()];
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==s2.charAt(i)){
                longestChild++;
                isTrue[i]=true;
            }
        }

        for (int i=0;i<s1.length();i++){
            if (isTrue[i]){
                System.out.println("true");
            } else {
                System.out.println("False");
            }
        }
        List<String> list =new ArrayList<>();
    }
}
