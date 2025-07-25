class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0,maxlength=0;
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                maxlength = Math.max(maxlength, right-left);
            } else{
                set.remove(s.charAt(left++));
            }
        }
        return maxlength;
    }
}
