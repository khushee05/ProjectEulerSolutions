import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            
            ArrayList<String> arr = new ArrayList<>();
            for(int i=0; i<n-(k-1); i++) {
                String str = "";
                for(int j=i; j<i+k; j++) {
                    str = str + num.charAt(j);
                }
                if(str.length()==k) {
                    arr.add(str);
                    
                }
            }
            //System.out.println(arr);
            int max = 0;
            for(int i=0; i<arr.size(); i++) {
                String str2 = arr.get(i);
                int prod = 1;
                for(int j=0; j<k; j++) {
                    int a=Integer.parseInt(String.valueOf(str2.charAt(j)));  
                    prod = prod * a;
                }
                if(prod > max) {
                    max = prod;
;                }
            }
            System.out.println(max);
            
        }
        
    }
}
