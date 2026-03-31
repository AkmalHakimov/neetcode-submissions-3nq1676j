class Solution {
    public boolean isValid(String s) {
       HashMap<Character, Character> map = new HashMap<>();

       map.put('(', ')');
       map.put('{', '}');  
       map.put('[', ']');  

        Stack<Character> stack = new Stack<>();
        for(int i = s.length()-1; i>=0; i--){
            char x = s.charAt(i);
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
