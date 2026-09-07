class Solution {
    public String convertToTitle(int Number) {
        String ans="";
       
        while(Number>0){
             Number=Number-1;
           int rem=Number%26;
           char letter=(char)('A'+rem); 
           ans=letter+ans;
           Number=Number/26;
        }
        return ans;
    }
}
