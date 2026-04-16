class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n2<n1) return false;

        int freq1[] = new int[26];
        int freq2[] = new int[26];


        for(int i=0;i<n1;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<n2-n1;i++){
            if(matchs(freq1,freq2)){
                return true;
            }
            freq2[s2.charAt(i)-'a']--;
            freq2[s2.charAt(i+n1)-'a']++;

        }
    return matchs(freq1,freq2);
    }

    public boolean matchs(int[] freq1, int[] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}
