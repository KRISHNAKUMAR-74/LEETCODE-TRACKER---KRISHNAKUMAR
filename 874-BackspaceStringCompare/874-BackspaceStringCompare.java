// Last updated: 11/08/2026, 14:50:59
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
            }}else s1.push(c);
            
        }
            for(char d : t.toCharArray()){
                if(d=='#'){
                    if(!s2.isEmpty()){
                        s2.pop();
                }}else s2.push(d);
                
            }
            String x = String.valueOf(s1);
            String y = String.valueOf(s2);
            if(x.equals(y))
            return true;
            return false;
        }  
    }