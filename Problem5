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
            boolean b = false;
            int num = 1;
            int ans  = 1;
            while(b !=true){
                b = divisible(num,n);
                if(b == true){
                    ans = num;
                }
                num+=1;
            }
            System.out.println(ans);
        }
    }
    static boolean divisible(int num,int n){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            if(num%i == 0){
                map.put(i, true);
            }
            else{
                map.put(i,false);
            }
        }
        
        for (Map.Entry<Integer, Boolean> e : map.entrySet()){
            if(e.getValue()== false){
                return false;
            }
        }
        return true;
            
    }
}
