// 581 ms	40.5 MB	java
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
            
        for(int i =0; i<height.length-1; i++) {
            for(int j= i+1; j<height.length; j++) {
                int min = Math.min(height[i], height[j]);
                int container = min * (j-i);
                if(result < container) {
                    result = container;
                }
            }
        }
        return result;
    }
}
