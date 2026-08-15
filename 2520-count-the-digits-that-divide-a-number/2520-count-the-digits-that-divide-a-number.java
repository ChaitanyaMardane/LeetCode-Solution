class Solution {
    public int countDigits(int n) {
       int x = n;
       int cnt =0;
       while(x!=0){
        int l = x%10;
        cnt = n%l==0?cnt+1:cnt;
        x=x/10;
       }
       return cnt;
        
    }
}