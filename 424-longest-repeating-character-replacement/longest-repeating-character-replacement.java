class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxLen=0;
        int maxfreq=0;
        int freq[]=new int[26];
        for(int r=0;r<s.length();r++){
            int id=s.charAt(r)-'A';
            freq[id]++;
            maxfreq=Math.max(maxfreq,freq[id]);
            int winLen=r-l+1;
            int replace=winLen-maxfreq;
            if(replace>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}