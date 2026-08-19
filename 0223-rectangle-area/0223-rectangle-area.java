class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long area1=Math.abs(ax2-ax1)*Math.abs(ay2-ay1);
        long area2=Math.abs(bx2-bx1)*Math.abs(by2-by1);
         int axMin = Math.min(ax1, ax2);
        int axMax = Math.max(ax1, ax2);
        int ayMin = Math.min(ay1, ay2);
        int ayMax = Math.max(ay1, ay2);

        // Step 2: Normalize Rectangle B coordinates (min and max)
        int bxMin = Math.min(bx1, bx2);
        int bxMax = Math.max(bx1, bx2);
        int byMin = Math.min(by1, by2);
        int byMax = Math.max(by1, by2);

        // Step 3: Calculate X and Y overlap distances
        int xOverlap = Math.max(0, Math.min(axMax, bxMax) - Math.max(axMin, bxMin));
        int yOverlap = Math.max(0, Math.min(ayMax, byMax) - Math.max(ayMin, byMin));
        return (int)(area1+area2 - xOverlap*yOverlap);

    }
}