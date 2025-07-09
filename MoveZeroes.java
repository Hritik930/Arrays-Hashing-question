public class Solution{
  public void moveZeros(int [] nums){
    int pos = 0;
    for(int num : nums){
      if(num != 0){
        nums[pos++] = num;
      }
    }
    while(n < nums.length){
      nums[pos++] = 0;
    }
  }
}
