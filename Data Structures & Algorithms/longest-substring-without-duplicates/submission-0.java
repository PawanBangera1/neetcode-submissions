class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Longest =0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(i));
            Longest = Math.max(Longest, i-l+1);
        }
        return Longest;
    }
}
