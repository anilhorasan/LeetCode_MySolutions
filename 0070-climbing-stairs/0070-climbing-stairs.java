class Solution {
    // Dynamic programming with Constant Space
    //Time complexity  O(n) - Single loop iterating up to n
    //Space complexity O(1) - Uses only a few variables.
     public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev1 = 2, prev2 = 1;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    
    // Dynamic programming with arrays
    //Time complexity  O(n)
    //Space complexity O(n)
    public int climbStairs3(int n) {
        if(n <= 2) return n;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for(int i = 2; i <= n-1; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int k : a){
            System.out.println(k);
        }
        return a[n-1];
    }


    // Recursive with memoization
    //Time complexity  O(n)
    //Space complexity O(n)
    public int climbStairs4(int n) {
        if(n <= 2)                  return n;
        Map<Integer, Integer> map = new HashMap<>();
         if (map.containsKey(n))    return map.get(n);

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        //map.put(n, result);
        return result;
    }



    /// Recursive
    //Time complexity  O(2^n)
    //Space complexity O(n)
    public int climbStairsRecursion(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}