//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
         long[] left = new long[nums.length];

    // Array to store all right multiplication
    long[] right = new long[nums.length];

    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    long[] ans = new long[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = (long)left[i] * right[i];
    }

    return ans;
	} 
} 
