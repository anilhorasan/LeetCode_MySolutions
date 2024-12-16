public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // `result` will store the reversed bits
        int result = 0;
        
        // Process each of the 32 bits
        for (int i = 0; i < 32; i++) {
            // Add the least significant bit of `n` to `result`
            result = (result << 1) | (n & 1);
            
            // Right shift `n` by 1 to process the next bit
            n >>>= 1;
        }
        
        return result;
    }

    // you need treat n as an unsigned value
    public int reverseBits2(int n) {
        System.out.println("n: " + n);
        int k = n;
        long result = 0;
        int i = 0;
        while(k > 0){
            k = k/2;
            i++;
        }
        System.out.println("i: " + i);
        result = (int)(Math.pow(2, 32-i));
        System.out.println("result: " + result);
        while(n > 0){
            
            result =  result * 2 + n % 2; 
            n = n/2;
            System.out.println("result: " + result);
            System.out.println("n: " + n);
        }
        System.out.println(result);

        return (int)result;
        
    
    }
}