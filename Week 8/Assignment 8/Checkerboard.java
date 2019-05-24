/******************************************************************************
  *  Name: 
  *
  *  Description: Plots an n-by-n checkerboard.
  *
  ******************************************************************************/

public class Checkerboard { 
    
    public static void main(String[] args) { 
        
        int n = Integer.parseInt(args[0]);
        
        // these methods allow you to set the size of the checkerboard, 
        // which makes the rest of the program easier
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        
        for (____________________) {
            
            for (____________________) {
                
                // Keep track somehow of whether you should be drawing 
                // a red square or a black square. There are multiple
                // ways to do this!
                if (______________) 
                    StdDraw.setPenColor(StdDraw.BLACK);
                else                  
                    StdDraw.setPenColor(StdDraw.RED);
                
                StdDraw.filledSquare(_____, _____, ____);
            }
        }
    }
    
}