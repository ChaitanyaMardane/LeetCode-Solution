class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxWater=0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;

            // System.out.println("h : "+ " w : " + w +" = "+ h*w);
            maxWater=Math.max(maxWater,h*w);
            if(height[l]>height[r]) r--;
            else l++;
        }
        return maxWater;
        
    }
}