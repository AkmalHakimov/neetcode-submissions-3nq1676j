class Solution {

    public String encode(List<String> strs) {

        String s = "";
        for(String str : strs){
            s =  s + str.length() + "#" + str;
        }

        return s;
    }

    public List<String> decode(String str) {
        
        List strs = new ArrayList<>();

        int i = 0;
        while(i<str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            i = j+1;
            j = j+length+1;
            String s = str.substring(i,j);

            strs.add(s);

            i = j;
        }

        return strs;
    }
}
