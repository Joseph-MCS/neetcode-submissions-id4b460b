class Solution {
    public int lengthOfLastWord(String s) {
        
        Stack<String> stringStk = new Stack<>();
        String current = ""; 
        int i = 0; 
        while ( i < s.length() )
        {
            while ( i <s.length() && s.charAt(i)!=' ')
            {
                current+=s.charAt(i++);
            }

            if (current.length() > 0) stringStk.push(current);
            current = "";
            i++;

        }
        return stringStk.pop().length();
        
    }
}