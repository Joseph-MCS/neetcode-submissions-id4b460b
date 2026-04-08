class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> table = new HashSet<>(); 
        for ( int i = 0; i<nums.length; i++)
        {
            if ( table.contains(nums[i]))
            {
                return true;
            }
            else
            {
                table.add(nums[i]);
            }
        }

        return false;

       
        
    }
}