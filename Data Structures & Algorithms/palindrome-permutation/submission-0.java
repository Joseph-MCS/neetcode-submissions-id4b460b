class Solution {
    public boolean canPermutePalindrome(String s) {

        HashMap<Character,Integer> characters = new HashMap<>();
        for ( int i = 0; i<s.length(); i++)
        {
            if ( !characters.containsKey(s.charAt(i)))
            {
                characters.put(s.charAt(i),1);
            }
            else 
            {
                characters.put(s.charAt(i),characters.get(s.charAt(i))+1);
            }
        }
        boolean uniqueMedian = true; 
        if ( s.length()%2!=1) uniqueMedian = false;

        for (int value : characters.values()) 
        {
           if ( value%2!=0)
           {
            if ( uniqueMedian==true)
            {
               uniqueMedian = false;
            }
            else
            {
                return false;
            }
           } 
        }
        return true;

    
        
    }
}
