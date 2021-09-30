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

//using dp
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
            long sum = sumPrime(n);
            System.out.println(sum);
        }
    }
    public static long sumPrime(int n){
        
        long dp[] = new long[n+1];
        long arr[] = new long[n+1];
        arr[0]=1; arr[1]=1;
        for(int i=2 ; i<=Math.sqrt(n); i++){
            if(arr[i]==0){
                for(int j=i*i; j<=n; j+=i){
                    arr[j] = 1;
                }
            }
            
        }
        
        long sum = 0;
        for(int i=1; i<=n; i++){
            if(arr[i] ==0){
                sum = sum + i;
            }
            dp[i] =sum;
        }
        return dp[n];
    }
}
