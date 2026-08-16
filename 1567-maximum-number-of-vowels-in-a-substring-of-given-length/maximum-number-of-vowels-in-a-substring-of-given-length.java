class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int c=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
            max=c;
        }
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i-k);
            if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                c--;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
                max=Math.max(c,max);
            }
        }
        return max;
    }
}