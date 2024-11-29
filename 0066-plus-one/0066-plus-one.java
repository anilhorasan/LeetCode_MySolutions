class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len-1;
        while(i >= 0){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i--] = 0;
        }

        int[] new_digits = new int[len+1];
        new_digits[0] = 1;
        return new_digits;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}