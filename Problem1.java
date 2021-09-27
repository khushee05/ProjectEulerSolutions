import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            n = n - 1; //below n
            long S3 = sum(n, 3);
            long S5 = sum(n, 5);
            long S15 = sum(n, 15);
            System.out.println(S3+S5-S15);
            
        }
    }
    static long sum(long n, int k){
        return k * ((n / k) * ((n / k) + 1)) / 2;
    }
}
