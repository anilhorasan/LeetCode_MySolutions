class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n >= 1) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            // Check if the number has been seen before
            if (seenNumbers.contains(sum)) {
                //System.out.println("Loop detected starting with number: " + sum);
                return false;
            }
            // Mark the number as seen
            seenNumbers.add(sum);
            n = sum;
        }
        return true;
    }

public boolean isHappy2(int n) {
        int count = 0;
        while (n != 1) {
            int sum = 0;
            while (n >= 1) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            count++;
            if (count > 100)
                return false;
            System.out.println("count: " + count);
            System.out.println("sum: " + sum);
            n = sum;
        }
        return true;
    }


}