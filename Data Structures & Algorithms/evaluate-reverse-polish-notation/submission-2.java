class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> operands = new Stack<Integer>();
       int res;
       for(String token:tokens){
        switch (token){
        case "+":
        case "-":
        case "*": 
        case "/": 
            int num =  operands.pop();
            int num2 =  operands.pop();
            res=0;
            switch(token){
            case "+": res = num2+num; break;
            case "-": res = num2-num; break;
            case "*": res = num2*num; break;
            case "/": res = num2/num; break;
            }
        operands.push(res);
        break;
        default : 
        operands.push( Integer.parseInt(token));
        break;
        }
       }
    return operands.pop();
    }
}
