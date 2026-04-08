class Solution {
    public int removeDuplicates(int[] nums) {

        // remove duplicates in place
        int n = nums.length;
        for ( int i = 0; i < n - 1; i++ )
        {
            while ( i + 1 < n && nums[i+1] == nums[i] )
            {
                for ( int k = i + 1; k < n - 1; k++ )
                {
                    nums[k] = nums[k+1];
                }
                n--;
            }
        }

        // each number is given to be uniques based on previous algo

        int uniques = n;

        return uniques;
    }
}