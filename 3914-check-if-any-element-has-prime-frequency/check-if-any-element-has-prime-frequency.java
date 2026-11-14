class Solution {
    public boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;
        return c==2;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
           map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int i:map.values()){
            if(isPrime(i)) return true;
        }
        return false;
    }
}