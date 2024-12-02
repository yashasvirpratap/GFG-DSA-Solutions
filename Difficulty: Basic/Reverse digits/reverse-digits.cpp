//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    int reverseDigits(int n) {
        int reversednum=0;
        while(n!=0){
            int digit=n%10;
            reversednum=reversednum*10+digit;
            n/=10;
        }return reversednum;
    }
};

//{ Driver Code Starts.
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        Solution ob;
        int ans = ob.reverseDigits(n);
        cout << ans << "\n";

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends