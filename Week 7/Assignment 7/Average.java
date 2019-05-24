/* **************************************************************************
 * Name:
 *
 * Description: This program contains methods for returning the average of
 * an array. 
 **************************************************************************** */

public class Average {
    
    // this method takes an int array a and returns the average 
    // of the elements in the array
    private static double average(int [] a) {
        

        return ___________;
    }
    
    // this method takes a double array a and returns the average 
    // of the elements in the array
    private static double average(double [] a) {
        
        
        return ___________;
    }
    
    
    public static void main(String[] args) {

        
        int [] a = {1, 2, 3, 4};
        int [] b = {0};
        int [] c = {-3, -1, 10};
        
        if ((average(a) != 2.5) || (average(b) != 0.0) || (average(c) != 2.0))
            System.out.println("Your int average function is not working correctly!");
            
        double [] d = {1.2, 2.4, 3.6, 4.8};
        double [] e = {0, 1};
        double [] f = {Math.random()};
        
        if ((average(d) != 3.0) || (average(e) != 0.5) || (average(f) > 1.0) || (average(f) < 0.0))
            System.out.println("Your double average function is not working correctly!");
            

    }
}

