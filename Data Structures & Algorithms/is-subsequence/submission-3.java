class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; 
        int j = 0; 

        if ( s.length() == 0 ) return true;

        while ( i < t.length() && j < s.length() )
        {
            if( s.charAt(j) == t.charAt(i) ) j++;
            i++;
        }
        if ( j >= s.length() ) return true;
        else return false;
        
    }
}