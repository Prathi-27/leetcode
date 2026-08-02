class Solution {
    public boolean isPalindrome(int x) {
         int org=x;
        int rev=0;
        int sum=0;
        if(x<0)
        {
            return false;
        }
    
        while(x!=0)
        {
            rev=x%10;
            sum=sum*10+rev;
            x=x/10;
        }
        return (sum==org);
        
        
    }
}