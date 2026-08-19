class Solution {
public:
    int divide(int dividend, int divisor) {
         if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        // Determine if the final result should be negative
        bool isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to negative to handle INT_MIN safely
        int dvd = dividend < 0 ? dividend : -dividend;
        int dvs = divisor < 0 ? divisor : -divisor;

        long ans = 0;

        // In negative terms, dvd <= dvs means absolute dvd >= absolute dvs
        while (dvd <= dvs) {
            long  temp = dvs;
            long  multiple = 1;

            // Double the divisor using addition (temp + temp)
            // Prevent overflow: temp must not be less than half of INT_MIN
            while (temp >= (INT_MIN>>1) && dvd <= (temp + temp)) {
                temp += temp;
                multiple += multiple;
            }

            dvd -= temp;
            ans += multiple;
        }
        cout<<ans<<endl;
        if(isNegative){
            if(ans> (2147483648))return -2147483648;
            else return (int)-ans;
        }
        return ans> 2147483647 ? 2147483647 : (int)ans;
    }

    
};