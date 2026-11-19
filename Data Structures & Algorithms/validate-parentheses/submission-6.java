class Solution {
    public boolean isValid(String s) {
        Deque<Character>stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i ++){  
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                //we hit here there is a closing one 
                if(stack.isEmpty()){
                    return false; 
                }
                char most_recent = stack.peek();
                if (c == '}'){
                    if (most_recent != '{'){
                        return false;
                    }
                    stack.pop();
                }
                if (c == ']'){
                    if (most_recent != '['){
                        return false;
                    }
                    stack.pop();
                }
                if (c == ')'){
                    if (most_recent != '('){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
