public class Solution{
  public void moveZeros(int [] nums){
    int pos = 0;
    for(int num : nums){
      if(num != 0){
        nums[pos] = num;
        pos++;
      }
    }
    while(n < nums.length){
      nums[pos] = 0;
      pos++;
    }
  }
}
