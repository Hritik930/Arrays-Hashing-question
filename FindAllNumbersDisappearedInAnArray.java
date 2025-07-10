public class Solution{
  public List<Integer> logic(int [] nums){
    List<Integer> result = new ArrayList<>();
    for(int num: nums){
      int i = Math.abs(num) - 1;
      if(nums[i] > 0){
        nums[i] = -nums[i];
      }
    }
    for(int i=0; i<nums.length; i++){
      if(nums[i]>0){
        result.add(i+1);
      }
    }
    retrun result;
  }
}
