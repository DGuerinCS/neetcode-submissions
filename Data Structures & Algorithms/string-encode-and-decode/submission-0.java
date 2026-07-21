class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < strs.size(); i++){
            String word = strs.get(i);

            sb.append(word.length()).append("!").append(word);
        }
        String encoded = sb.toString();
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            StringBuilder numBuild = new StringBuilder();
            while(str.charAt(i) != '!'){
                numBuild.append(str.charAt(i));
                i++;
            }
            int wordLen = Integer.parseInt(numBuild.toString());
            i++;
            String decoded = str.substring(i, i+wordLen);
            decodedList.add(decoded);
            i+=wordLen;
        }
        return decodedList;
    }
}

