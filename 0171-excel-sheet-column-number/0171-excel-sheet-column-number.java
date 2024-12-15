class Solution {
    
    // avoid using Math.pow(26, i) by calculating the result directly in a more efficient way. 
    // Multiply the result by 26 and then add the value of each character.
    // Time complexity O(n) 
    // Space complexity O(1) 
    public int titleToNumber(String columnTitle) {

        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }
    
    
    
    // calculate the corresponding number by iterating through each character in the column title 
    // and calculating its positional value based on base-26 arithmetic
    // Time complexity O(n) 
    // Space complexity O(1) 
    public int titleToNumber2(String columnTitle) {

        int res = 0;
        int len = columnTitle.length();
        for(int i = 0; i < len; i++){
            res += ((int)(columnTitle.charAt(len-1-i) - 'A' + 1))*(Math.pow(26, i));  // result = 10^i);
        }
        return res;
    }

    // RECURSIVE
    // Time complexity O(n) 
    // Space complexity O(n) 
    public int titleToNumberRECURSIVE(String columnTitle) {
        // Base case: if the string has only one character, return its numeric value
        if (columnTitle.length() == 1) {
            return columnTitle.charAt(0) - 'A' + 1;
        }

        // Process the first character and recursively process the rest of the string
        int currentValue = columnTitle.charAt(0) - 'A' + 1;
        return currentValue * (int) Math.pow(26, columnTitle.length() - 1) 
                + titleToNumber(columnTitle.substring(1));
    }
}