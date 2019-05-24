/* **************************************************************************
 * Name:
 *
 * Description: This program has three methods: the first one returns the
 * absolute value of a given int, the second returns the hypotenuse of 
 * a triangle given two sides, and the third GRAVITY
 **************************************************************************** */

public class mathematicalFunctionsTest {
    
    private static int abs(int a) {
        // calculate and then return the absolute value of a
        
        if (a < 0) a = -a;
        
        return a;
    }
    
    private static double hypotenuse(double a, double b) {
        // calculate the hypotenuse of a right triangle
        // with side lengths a and b. Recall that the formula
        // for a right triangle is a*a + b*b = c*c, where 
        // c is the hypotenuse. Also, recall that 
        // Math.sqrt(x) gives you the square root of x. 
        
        
        return Math.sqrt(a*a + b*b);
    }

    
    private static double calculateForce(double mass1, double mass2, double distance) {
        
        // this is the gravitational constant
        double g = 6.67e-11;
        
        if (distance > 0) {
            double force = (mass1 * mass2 * g)/(distance*distance);
            return force;
        }
        else
            return 0.0;
    }
    
    
    public static void main(String[] args) {
        
        if ((abs(-5) != 5) || (abs(0) != 0) || (abs(37) != 37))
            System.out.println("Your abs function is not working correctly!");
            
        if ((hypotenuse(3,4) != 5) || (hypotenuse(5,12) != 13) || (hypotenuse(0,0) != 0))
            System.out.println("Your hypotenuse function is not working correctly!");
        
        if ((calculateForce(5,6.67e-11,6.67e-11) != 5))
            System.out.println("Your force function is not working correctly!");
     
    }
}

