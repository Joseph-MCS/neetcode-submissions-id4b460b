class Solution {
    public String stringShift(String s, int[][] shift) {

        StringBuilder sb = new StringBuilder(s);

        for ( int i = 0; i<shift.length; i++)
        {
            if ( shift[i][0] == 0 )
            {

                for ( int j = 0; j<shift[i][1]; j++)
                {
                    String firstLetter = sb.substring(0,1);
                    sb.deleteCharAt(0);
                    sb.append(firstLetter);
                }

            }
            else
            {

                for ( int j = 0; j<shift[i][1]; j++)
                {
                    String lastLetter = sb.substring(sb.length()-1);
                    sb.deleteCharAt(sb.length()-1);
                    sb.insert(0,lastLetter);
                }

            }
        }

        return sb.toString();

        
    }
}
