class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n) && n!=1){
            set.add(n);
            n = sumDigit(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public int sumDigit(int n){
        int sum = 0;
            while (n > 0) {
            int digit = n%10;
            sum = sum + digit*digit;
            n/=10;
        }
        return sum;
    }
}
