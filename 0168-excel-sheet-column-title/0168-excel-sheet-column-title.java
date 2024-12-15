class Solution {

    // This is the most common solution where we repeatedly calculate the character corresponding to the last "digit" in base-26.
    // Time complexity O(log26(N))  Each iteration reduces columnNumber by a factor of 26.
    // Space complexity O(log26(N))  For the StringBuilder, as we store one character per iteration
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();
        columnNumber--; // Convert to 0-based index

        while (columnNumber >= 0) {
            char ch = (char)((columnNumber  % 26) + 'A');
            sb.append(ch); // Append the current character
            columnNumber =  (columnNumber / 26) - 1; // Move to the next digit   // Convert to 0-based index 
        }

        return sb.reverse().toString(); // Reverse the string to get the correct order
    }

    // This approach builds the solution from left to right using recursion.
    // Time complexity O(log26(N))  Each recursive call reduces columnNumber by a factor of 26.
    // Space complexity O(log26(N))  For the recursion stack.
    public String convertToTitleRECURSIVE(int columnNumber) {
        if (columnNumber == 0) {
            return "";
        }
        columnNumber--; // Convert to 0-based index
        char ch = (char) ('A' + (columnNumber % 26));
        return convertToTitle(columnNumber / 26) + ch;
    }

    // This is a less efficient approach because strings are immutable, but it's a valid alternative for smaller inputs.
    // Time complexity O(log26(N)) 
    // Space complexity O(log26(N))  FOR THE STACK
    public String convertToTitleSTACK(int columnNumber) {
        Stack<Character> stack = new Stack<>();
        
        while (columnNumber > 0) {
            columnNumber--;
            stack.push((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }


    // This is a less efficient approach because strings are immutable, but it's a valid alternative for smaller inputs.
    // Time complexity O(log26(N)) 
    // Space complexity O(log26(N) x k)  Where k is the length of the result. This is because strings are immutable in Java, and each concatenation creates a new string.
    public String convertToTitleSTRINGCONCATENATION(int columnNumber) {
        String result = "";
        
        while (columnNumber > 0) {
            columnNumber--;
            result = (char) ('A' + (columnNumber % 26)) + result;
            columnNumber /= 26;
        }
        
        return result;
    }



}