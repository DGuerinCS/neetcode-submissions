class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        bracktrack(n,0,0,res,stack);
        return res;
    }

    public void bracktrack(int n, int open, int close, List<String> res, Stack<Character> stack){
        if (open == n && close == n) {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) sb.append(c);
            res.add(sb.toString());
            return;
        }
        if(open<n){
            stack.push('(');
            bracktrack(n,open+1,close,res,stack);
            stack.pop();
        }
        if(close<open){
            stack.push(')');
            bracktrack(n,open,close+1,res,stack);
            stack.pop();
        }
    }
}
