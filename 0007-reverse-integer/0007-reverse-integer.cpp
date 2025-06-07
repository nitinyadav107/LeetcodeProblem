class Solution {
public:
    void revDig(int n, int &ans){
        if(n == 0) return;
        if(ans > INT_MAX/10 || ans < INT_MIN/10){
            ans = 0;
            return;
        }
        int dig = n % 10;
        ans = ans*10 + dig;
        revDig(n/10, ans);
    }
    int reverse(int n) {
        int ans = 0;
        revDig(n, ans);
        return ans;
    }
};