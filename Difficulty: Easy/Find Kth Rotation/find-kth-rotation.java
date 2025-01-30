//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> nums) {
        int s = 0, e = nums.size() - 1;
        int min = Integer.MAX_VALUE;
        int index = -1; // Initialize the index to -1 to handle cases explicitly

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Update min and index if nums[mid] is smaller
            if (nums.get(mid) < min) {
                min = nums.get(mid);
                index = mid;
            }

            // Check if left half is sorted
            if (nums.get(s) <= nums.get(mid)) {
                // If nums[s] is smaller, update min and index
                if (nums.get(s) < min) {
                    min = nums.get(s);
                    index = s;
                }
                // Move to the right half
                s = mid + 1;
            } else {
                // Else move to the left half
                e = mid - 1;
            }
        }
        return index;
    }

}