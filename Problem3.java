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
            long n = in.nextLong();
            long i =2;
        
            while(i*i<= n) {
            if(n%i==0){
                n  /= i;
            }else{
                i++;
            }
        }
            System.out.println(n);
        }
    }
}
