/******************************************************************************
  *  Name:
  * 
  *  Description: This program draws a blue dot in the center of the standard
  *  draw canvas and a pink line along the bottom of the canvas.
  *
  ******************************************************************************/

public class DotAndLine { 
    public static void main(String[] args) { 
        
        // make the pen a reasonable size
        StdDraw.setPenRadius(0.05);
        
        // draw a blue point in the center
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        
        // draw a magenta line along the bottom
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
        
    }
}