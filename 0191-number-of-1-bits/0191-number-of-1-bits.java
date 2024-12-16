class Solution {
    // Iterative Bit Manipulation Use bitwise AND and right shift to count 1 bits.
    // Time complexity O(32)  as an integer has at most 32 bits.
    // Space complexity O(1) 
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if the least significant bit is 1
            n >>>= 1;       // Unsigned right shift
        }
        return count;
    }

    
    // Brian Kernighan’s Algorithm
    // Time complexity O(n)  k <= 32 (number of 1s)
    // Space complexity O(1)
    public int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // Turn off the rightmost 1 bit
            count++;
        }
        return count;
    }

    // Built-in Algorithm
    // Time complexity O(1)
    // Space complexity O(1)
    public int hammingWeight3(int n) {
        return Integer.bitCount(n);
    }

    public int convertToBinary(int n) {
        int result = 0;
        int place = 1; // Position in the binary number
        
        while (n > 0) {
            int remainder = n % 2;      // Get the binary digit
            result += remainder * place; // Add it to the result
            n /= 2;                     // Divide by 2
            place *= 10;                // Move to the next position
        }

        return result; 
    }

}