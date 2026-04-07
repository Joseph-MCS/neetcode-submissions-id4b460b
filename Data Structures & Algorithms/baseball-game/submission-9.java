class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> scores = new Stack<>();

        for ( int i = 0; i < operations.length; i++ )
        {

            if ( !operations[i].equals("+") && !operations[i].equals("C") && !operations[i].equals("D"))
            {
                scores.push(Integer.parseInt(operations[i]));
            }
            else
            {
                if ( operations[i].equals("+"))
                {
                    int a = scores.pop();
                    int b = scores.pop();
                    scores.push(b);
                    scores.push(a);
                    scores.push(a+b);
                }
                else if ( operations[i].equals("C"))
                {
                    scores.pop();
                }   

                else if ( operations[i].equals("D"))
                {
                    scores.push(2*scores.peek());
                }
            }
        }

            int total = 0;

            while ( !scores.empty() )
            {
                total+=scores.peek();
                scores.pop();

            }

            return total;
   
    
  }
}