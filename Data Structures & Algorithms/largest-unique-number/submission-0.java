class Solution {
    public int largestUniqueNumber(int[] nums) {

        HashMap<Integer,Boolean> uniques = new HashMap<>();
        for ( int i = 0; i<nums.length; i++ )
        {
            if (!uniques.containsKey(nums[i]))
            {
                uniques.put(nums[i],true);
            }
            else
            {
                uniques.put(nums[i],false);
            }
        }
        int largestUnique = -1;
        for ( int j = 0; j<nums.length; j++ )
        {
            if ( uniques.get(nums[j]) && nums[j] > largestUnique)
            {
                 largestUnique = nums[j];
            }
        }
        return largestUnique;

        
    }
}
