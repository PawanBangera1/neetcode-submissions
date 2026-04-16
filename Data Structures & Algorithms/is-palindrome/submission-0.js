class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        let str = s.replace(/[^A-Za-z0-9]/gi,'').toLowerCase();
        let revStr = str.split("").reverse().join("")
        return str===revStr;
    }
}
