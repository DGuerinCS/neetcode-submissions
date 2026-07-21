class Solution {
    public int findDuplicate(int[] nums) {
        for(int i : nums){
            int dx = Math.abs(i) - 1;
            if(nums[dx] < 0){
                return Math.abs(i);
            }
            nums[dx]*= -1;
        }
        return -1;
    }
}
