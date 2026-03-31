class Solution {
    public boolean isPalindrome(String s) {
       
       int l = 0, e = s.length()-1;

       while(l<e){
         
         while(l<e && !Character.isLetterOrDigit(s.charAt(l))){
            l++;
         }

         while(e>l && !Character.isLetterOrDigit(s.charAt(e))){
            e--;
         }

         if(Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(e))){
            return false;
         }

         l++;
         e--;

       }

       return true;
    }
}
