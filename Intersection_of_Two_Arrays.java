import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> s = new HashSet<>();
      for(int n : nums1){
        s.add(n);
      }
      Set<Integer> r = new HashSet<>();
      for(int n : nums2){
        if(s.contains(n)){
            r.add(n);
        }
      }

      int [] result = new int[r.size()];
      int i= 0;
      for( int n : r){
        result[i++] = n;
      }
      return result;
    }
}
