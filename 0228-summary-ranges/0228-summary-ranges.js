/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {

    const result = [];
    const lengthNums = nums.length;
    if (lengthNums === 0) return result;

    let left = nums[0];

    for (let i = 1; i < lengthNums; i++) {
        // If the current number is not consecutive, add the range to the result
        if (nums[i] !== nums[i - 1] + 1) {
            result.push(left === nums[i - 1] ? 
                        `${left}` : 
                        `${left}->${nums[i - 1]}`);
            left = nums[i]; // Update the start of the next range
        }
    }

    // Add the last range
    result.push(left === nums[lengthNums - 1] ? 
                `${left}` : 
                `${left}->${nums[lengthNums - 1]}`);

    return result;
    
};