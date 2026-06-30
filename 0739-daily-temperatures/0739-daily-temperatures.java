class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1]=0;
        st.push(n-1);
        int i = n-2;
        while(i>=0 ){
            while(!st.isEmpty() && arr[st.peek()]<= arr[i] ) st.pop();
            ans[i]=(st.isEmpty())?0:st.peek()-i;
            st.push(i);
            i--;
        }
        return  ans;
        
    }
}