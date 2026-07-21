class Solution {
    public int maxArea(int[] heights) {
        int j = heights.length-1;
        int max = 0;
        int i = 0;
        while(i<j){
            int left =heights[i];
            int right = heights[j];
            if((j - i) * Math.min(left, right) > max){
                max = (j - i) * Math.min(left, right);
            }
            if(left> right){
                j--;
            }
            else if(left<= right){
                i++;
            }
        }
        return max;
    }
}
