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
            int prod=0,a=0;
            for(int i=100;i<=999;i++){
                for(int j=100;j<=999;j++){
                    prod=i*j;
                    int num=prod;
                    int reversenum=0;
                    while(num!=0){
                    reversenum=reversenum*10;
                    reversenum=reversenum+num%10;
                    num=num/10;}
                    if(prod==reversenum && prod<n)
                    if(prod>a)
                    a=prod;
                }
            }
            System.out.println(a);
        }
    }
}
