//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        if(n==1) return m;
        // int ans=-1;
        int low=1,high=m/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            long pow=1;
            for(int i=0;i<n;i++){
                 pow*=mid;
            }
            if(pow==m) return mid;
            else if(pow>m)
            high=mid-1;
            else
            low=mid+1;
            
        }
        return -1;
    }
}