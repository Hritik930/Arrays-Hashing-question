class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int count = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
============================================================================
      Another approach
============================================================================
public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1, current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue; // skip duplicates
            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }
}
