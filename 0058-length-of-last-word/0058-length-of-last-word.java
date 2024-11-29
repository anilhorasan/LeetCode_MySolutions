class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i;
        for(i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' ') break;
        }
        while (i >= 0 &&  s.charAt(i--) != ' ' )     count++;
        return count;
    }

    public int lengthOfLastWord2(String s) {
        int len = s.length();
        int count = 0;
        for(int i = len-1; i >= 0; i--){
            if(s.charAt(i) != ' ')      count++;
            else{                       if(count > 0) return count;}
        }
        return count;
    }

    public int lengthOfLastWord3(String s) {
        String[] splited = s.split("\\s+");
        return (splited[splited.length-1].length());
    }
}