class Solution {
    public boolean isValid(String s) {
        Stack<Character> p = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            switch(c) {
            case '(':
            case '{':
            case '[':
            p.push(c);
            break;
            case ')':
            if(p.isEmpty()||p.pop()!='(') return false;
            break;
            case '}':
            if(p.isEmpty()||p.pop()!='{') return false;
            break;
            case ']':
            if(p.isEmpty()||p.pop()!='[') return false;
            break;
            }
        }
        return p.isEmpty();
    }
}
