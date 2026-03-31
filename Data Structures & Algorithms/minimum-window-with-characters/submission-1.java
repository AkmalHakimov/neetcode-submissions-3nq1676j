class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length() || t.isEmpty()) return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0) + 1);
        }

        int have = 0, need = countT.size();

        int resLen = Integer.MAX_VALUE;

        int[] res = {-1,-1};

        int l =0;

        for(int r = 0; r<s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c,0)+1);

            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))) have++;

            while(have == need){
                if((r-l+1) < resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                    char charLeft = s.charAt(l);
                    window.put(charLeft, window.get(charLeft)-1);
                    if(countT.containsKey(charLeft) && window.get(charLeft) < countT.get(charLeft)){
                        have--;
                    }
                    l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
                
    }
}
