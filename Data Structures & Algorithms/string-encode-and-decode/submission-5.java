class Solution {

    public String encode(List<String> strs) {

        String theString = "";
        for(String str : strs){
            theString = theString + str.length() + '#' + str;
        }

        return theString;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            i = j+1;
            j = j+length+1;

            strs.add(str.substring(i,j));
            i = j;

        }

        return strs;


    }
}
