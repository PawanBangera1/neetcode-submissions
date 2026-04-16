class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> arr = new HashMap<>();

        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            arr.putIfAbsent(key, new ArrayList<>());
            arr.get(key).add(s);
        }
        return new ArrayList<>(arr.values());
    }
}
