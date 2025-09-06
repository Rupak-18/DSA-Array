class Solution {
    public String firstPalindrome(String[] words) {
        String result  = "";
        for(String word: words) {
            int i = 0;
            int j = word.length() - 1;
            while(i < j) {
                if(word.charAt(i) == word.charAt(j)) {
                    i++;
                    j--;
                }
                else
                    break;
            }
            if(i >= j) {
                result = word;
                break;
            }
        }
        return result;
    }
}