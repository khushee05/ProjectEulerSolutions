/*Find the sum of all the primes not greater than given N.*/


//Simple Approach
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
            int sum = 2;
            if(n==2){
                System.out.println(sum);
                return;
            }
            for(int i=3; i<=n; i=i+2){
                if(isPrime(i)){
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
    public static boolean isPrime(int n){
        if(n == 2 || n==3){
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
    }
}
