class Solution {
    public int[] productExceptSelf(int[] nums) {
        int s = nums.length;
        int[] preFix = new int[s];
        int[] postFix = new int[s];
        int[] ans = new int[s];

        preFix[0] = 1;
        for(int i=1; i < s; i++){
            preFix[i] = nums[i-1] * preFix[i-1];
        } 

        postFix[s-1]=1;
        for(int j=s-2; j >=0;j--){
            postFix[j] = nums[j+1] * postFix[j+1];
        }
        for(int k=0; k < s; k++){
            ans[k] = preFix[k] * postFix[k];
        }
    return ans;
    }
}  
