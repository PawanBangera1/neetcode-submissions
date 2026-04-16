class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> arr = new HashMap<>();
        for(String word: strs){
            char[] c =  word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            arr.putIfAbsent(key, new ArrayList<>());
            arr.get(key).add(word);
        }
        return new ArrayList<>(arr.values());
    }
}
