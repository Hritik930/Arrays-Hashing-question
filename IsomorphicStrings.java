class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s.length() != t.length()) return false;

        int[] sArr = new int[256]; 
        int[] tArr = new int[256]; 

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (sArr[cs] != tArr[ct]) {
                return false;
            }

            sArr[cs] = i + 1;
            tArr[ct] = i + 1;
        }

        return true;
    }
}
