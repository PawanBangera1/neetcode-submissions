class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int st = 0;
        int l = str.length()-1;
        while(st<=l){
            char sa = str.charAt(st);
            char la = str.charAt(l);

            if(!Character.isLetterOrDigit(sa)) st++;
            else if(!Character.isLetterOrDigit(la)) l--;

            else{
                if(sa!=la) return false;
                else {
                    l--;
                    st++;

                }
            }
        }
        return true;
    }
}
