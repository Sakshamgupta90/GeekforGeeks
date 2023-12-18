//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int mod=1000000007;
    
    static int fibo_memo(int n, int[] dp){
        
        if(n <= 1)
        return n;
        
        if(dp[n] != -1)
        return dp[n];
        
       return dp[n] = (fibo_memo(n-1, dp) + fibo_memo(n-2, dp))%mod;
    }
    
    static int fibo_tebo(int n, int[] dp){
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i<= n; i++){
            dp[i] = (dp[i-1] + dp[i-2])% mod;
        }
        
        return dp[n];
    }
    static int nthFibonacci(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
       
    // return fibo_memo(n, dp);
       return fibo_tebo(n, dp);
    }
}