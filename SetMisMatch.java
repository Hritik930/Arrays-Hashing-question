class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup= -1; int missing = -1;
        for(int num: nums){
            int i = Math.abs(num) -1;
            if(nums[i]<0){
                dup = Math.abs(num);
            }else{
                nums[i] = -nums[i];
            }
        }

        for(int i = 0; i< nums.length; i++){
            if(nums[i]> 0){
                missing = i+1;
                break;
            }
        }
        return new int[]{dup,missing};
    }
}
