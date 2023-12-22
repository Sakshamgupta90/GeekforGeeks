//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        //Approach1: use hashmap, store the count of each number and print the number more than n/2 time
        
        //Approach2: Moore Voting Algorithm
        int count = 0, ele= -1;
        for(int i: a){
            if(count == 0){
                ele = i;
            }
            
            if(ele == i){
                count++;
            }else{
                count--;
            }
        }
        
        
        
      count=0;
        for(int i=0;i<size;i++) {
            if(a[i]==ele) count++;
        }
        // Check if the candidate is the majority element condition
        if(count>Math.floor(size/2)) return ele;
        return -1;
    }
}