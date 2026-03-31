class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char x : s.toCharArray()){
            if(map.containsKey(x)){
                if(!stack.isEmpty() && stack.peek() == map.get(x)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(x);
            }
        }
        return stack.isEmpty();
        
    }
}
