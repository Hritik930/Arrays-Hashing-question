class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        Arrays.sort(nums);
        int left = 0, count = 0, right = 1;
        while(right<nums.length){
          if(left == right || nums[right] - nums[left] < k){
            right++;
          } 
          else if( nums[right] - nums[left] > k){
            left++;
          }
          else{ 
            left++; right++; count++;
          while(right<nums.length && nums[right] == nums[right - 1]) {
            right++;
            }
          }
        }
        return count;
    }
}
