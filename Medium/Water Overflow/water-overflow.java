//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int K = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.printf("%.6f\n" , ob.waterOverflow(K,R,C));
        }
    }
}
// } Driver Code Ends


class Solution {
    static double waterOverflow(int K, int R, int C) {
        // code here
        
        double[][] arr = new double[K+1][K+1];
        arr[0][0] = K;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                if(arr[i][j] > 1.0){ //condition of oferflow met and only 1 unit of water the glass will hold
                    double rem = arr[i][j] - 1.0;
                    arr[i][j] = 1.0;
                    arr[i+1][j] += rem / 2.0; //Left child
                    arr[i+1][j+1] += rem / 2.0; // right child
                }
            }
        }
        
        return arr[R-1][C-1];
    }
}