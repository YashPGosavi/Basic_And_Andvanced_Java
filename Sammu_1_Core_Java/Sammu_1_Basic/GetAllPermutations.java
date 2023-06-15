package Sammu_1_Core_Java.Sammu_1_Basic;
import java.util.*;

public class GetAllPermutations {
    public static void main(String[] args) {
        char c[] = new char[] {'!',' ', '#', '$', '%', '&', '(', ')', '*', '+' , ',' , '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[' , ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}','~'};
        int t = (int) Math.pow(2, c.length);
        for(int i=1;i<t;i++) {
            String s = Integer.toBinaryString(i);
            String comb = getComb(s,c);
            System.out.println(comb);
        }
    }

    private static String getComb(String s, char[] c) {
        String comb = "";
        int len = s.length();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                comb += c[len-i-1];
            }
        }
        return comb;
    }
}
