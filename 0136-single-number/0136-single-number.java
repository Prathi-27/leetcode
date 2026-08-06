class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int arr:nums)
        {
            if(!set.contains(arr))
            {
                set.add(arr);
            }
            else
            {
                 set.remove(arr);
            }
        }
        return set.iterator().next();

    }
}