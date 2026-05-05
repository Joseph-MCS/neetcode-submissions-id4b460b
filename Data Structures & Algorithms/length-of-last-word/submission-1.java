class Solution {
    public int lengthOfLastWord(String s) {

        String lastWord = "";
        char current = ' ';
        int i = s.length()-1; 
        while ( i >= 0 )
        {
            if(s.charAt(i)!=' ') break;
            
            i--;
        }
        while ( i >= 0 )
        {
            current = s.charAt(i);
            if ( current==' ') break;
            else lastWord+=current;
            i--;
        }
        return lastWord.length();
        
    }
}