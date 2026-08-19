class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double ans = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            // If N is odd, multiply the current product into the answer
            if ((N & 1) == 1) {
                ans *= currentProduct;
            }
            // Square the base for the next bit position
            currentProduct *= currentProduct;
            // Shift right to divide N by 2
            N >>= 1;
        }
        return ans;
    }
}
