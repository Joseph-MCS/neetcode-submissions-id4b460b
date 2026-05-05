class Solution {
    public int appendCharacters(String s, String t) {
        
        if ( s.length() == 0 ) return t.length();
        if ( t.length() == 0 ) return 0;

        int charsNeeded = t.length();
        int i = 0; // subsequence string
        int j = 0; // sequence string
        while ( i < t.length() && j < s.length() )
        {
            if (t.charAt(i) == s.charAt(j))
            {
                i++;
                charsNeeded--;
            }
            j++;
        }
        return charsNeeded;
        
    }
}