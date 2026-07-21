class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums, target, 0, ((nums.length)-1));
    }
    public int bSearch(int[] num, int key, int low, int high){
        int middle = low + ((high-low)/2);
        if (low > high){
            return -1;
        }
        if(key == num[middle]){
            return middle;
        }
        if(key> num[middle]){
            return bSearch(num, key, middle+1, high);
        }
        else{
            return bSearch(num, key, low, middle-1);
        }
    }
}
