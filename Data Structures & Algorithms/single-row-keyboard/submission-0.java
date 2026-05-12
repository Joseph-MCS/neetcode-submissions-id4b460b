class Solution {
    public int calculateTime(String keyboard, String word) {

        HashMap<Character,Integer> keyboardMap = new HashMap<>();

        for ( int i = 0; i<26; i++)
        {
            keyboardMap.put(keyboard.charAt(i),i);
        }
        int prev = 0;
        int next = 0;
        int fingerMove = 0;
        for ( int j = 0; j<word.length(); j++)
        {
                next=keyboardMap.get(word.charAt(j));
                if( prev > next )
                {
                    fingerMove+=Math.abs(prev-next);
                }
                else
                {
                    fingerMove+=Math.abs(next-prev);
                }
                prev = next;

        }
        return fingerMove;
        
    }
}
