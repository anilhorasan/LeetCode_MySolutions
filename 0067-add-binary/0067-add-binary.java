class Solution {
    public String addBinary4(String a, String b) {
        int lenA = a.length();
        
        boolean carry = false;
        String result = "";

        for(int i = lenA-1; i >= 0; i--){
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carry) result = "1" + result;
                else result = "0" + result;
                carry = true;
            }
            
            

            else {
                if(carry) {
                    result = "1" + result;
                    carry = false;
                }
                else result = "0" + result;
            }
        }
        if (carry) return "1" + result;
        return result;
    }

    public String addBinary5(String a, String b){

        // use mutable strings in reverse
        StringBuilder sb = new StringBuilder(); 
        int carry = 0;
        int t = 0;

        // if flag is true, longest string is a, else longest string is b
        boolean flag = a.length() >= b.length() ? true : false;
        int lenOfLong = flag ? a.length() : b.length();
        int lenOfShort = flag ? b.length() : a.length();
        for(int i = lenOfLong-1; i >= 0; i--){
            
            if (flag)   {
                t = a.charAt(i)- '0' + + carry;
                if (lenOfShort > 0)   t += b.charAt(lenOfShort - 1)- '0' ;
            }
            else        {
                t = b.charAt(i)- '0' + + carry;
                if (lenOfShort > 0)   t += a.charAt(lenOfShort - 1)- '0' ;
            }
            lenOfShort--;

            if (t == 0 || t == 1) {
                carry = 0;
            } else {
                t = t%2;
                carry = 1;
            }
            sb.append(Integer.toString(t));
        }

        if(carry == 1) sb.append(Integer.toString(carry));

        return sb.reverse().toString();


    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 ) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);  // Append the binary digit (0 or 1)
            carry = sum / 2;     // Update carry
        }
        if (carry == 1) sb.append(Integer.toString(carry));

    return sb.reverse().toString(); // Reverse and return the result
}


    public String addBinary3(String a, String b) {
        
        // use mutable strings in reverse
        StringBuilder sb = new StringBuilder(); 
        
        //two pointers starting from the back
        int i = a.length() - 1, j = b.length() -1, carry = 0; 
        
        while (i >= 0 || j >= 0) {
            
            int sum = carry; // sum equals 0 or 1 (if there is a carry) 
            
            //we subtract '0' to get the int value of the char from the ascii
            if (j >= 0) sum += b.charAt(j--) - '0'; 
            if (i >= 0) sum += a.charAt(i--) - '0';
            
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0
            carry = sum / 2;    //if sum==2 we have a carry, else no carry cuz 1/2=0
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }

    
    
    public String addBinary2(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int longestStringLength = lenA >= lenB ? lenA : lenB;
        boolean carry = false;
        String result = "";
        for(int i = longestStringLength-1; i >= 0; i--){
            if(a.charAt(i) == '1' && b.charAt(i-lenA+lenB) == '1'){
                if(carry) result += "1";
                else result += "0";
                carry = true;
            }
        }
        return " ";
    }
}