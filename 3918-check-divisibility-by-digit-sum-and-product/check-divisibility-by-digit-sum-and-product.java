class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        int sum=0;
        int mul=1;
        while(n>0){
            sum+=n%10;
            mul*=n%10;
            n=n/10;
        }
        if(og%(sum+mul)==0){
            return true;
        }else{
            return false;
        }
    }
}