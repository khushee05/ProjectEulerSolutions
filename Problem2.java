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
            long x = 1;
            long y = 2;
            long sum =0;
            while(y<=n){
                if(y%2==0){
                    sum = sum + y;
                }
                long temp = y;
                y = x + y;
                x = temp;
            }
            System.out.println(sum);
        }
    }
}
