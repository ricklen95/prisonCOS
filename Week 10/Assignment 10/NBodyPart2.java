/* *****************************************************************************
 *  Name:    
 *
 *  Description: 1. Reads two double command-line arguments T and deltaT.
 *               2. Reads in the universe from standard input using StdIn,
 *                  using several parallel arrays to store the data.
 *               3. Display the universe in its starting position
 ******************************************************************************/

public class NBodyPart2 {
    
    // sets the size of the universe based on R,
    // with (0, 0) being the center and size 2Rx2
    private static void setUniverse(double R) {
        StdDraw.setXscale((-R), (R));
        StdDraw.setYscale((-R), (R));
    }
    
    // draw the background image of the universe
    private static void drawUniverse(String background) {
        StdDraw.picture(0.0, 0.0, background);
    }
    
    // calculate the distance between two points
    // with an x distance of dx and a y distance of dy
    private static double calculateDistance(double dx, double dy) {
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    
    // calculate the force between two bodies, with masses mass1 and mass2,
    // that are distance apart from each other
    private static double calculateForce(double mass1, double mass2, double g, double distance) {
        if (distance > 0)
            return ((mass1 * mass2) * g) / (distance * distance);
        else
            return 0.0;
    }
    
    // calculate the value of costheta given the distance and x distance
    private static double calculateCos(double dx, double distance) {
        if (distance > 0)
            return (dx) / distance;
        else
            return 0.0;
    }
    
    // calculate the value of sintheta given the distance and y distance
    private static double calculateSin(double dy, double distance) {
        if (distance > 0)
            return (dy) / distance;
        else
            return 0.0;
    }
    
    // calculate the force in the x direction given dx, distance, and the overall force
    private static double calculateForceX(double dx, double distance, double forceJ) {
        double costheta = calculateCos(dx, distance);
        return forceJ * costheta;
    }
    
    // calculate the force in the y direction given dy, distance, and the overall force
    private static double calculateForceY(double dy, double distance, double forceJ) {
        double sintheta = calculateSin(dy, distance);
        return forceJ * sintheta;
    }
    
    // calculate acceleration in a direction given the force in that direction and the mass
    private static double calculateAcceleration(double force, double mass) {
        return force / mass;
    }
    
    // calculate the new velocity in a direction given the velocity, acceleration, and deltaT
    private static double calculateVelocity(double velocity, double deltaT, double acceleration) {
        return velocity + (deltaT * acceleration);
    }
    
    
    // calculate the new position given the position, velocity, and deltaT
    private static double calculatePosition(double position, double deltaT, double velocity) {
        return position + (deltaT * velocity);
    }
    
    public static void main(String[] args) {
        
        // Part 2: Read in all the important information
        
        // Read commandline args T and deltaT, both doubles
        ___________________________________________;
        ___________________________________________;
        
        // declares double t, sets to 0
        _____________________;
        
        // declares and sets gravitational constant
        double g = 6.67e-11;
        
        // declares string "background" for background image
        String background = "starfield.jpg";
        
        // read the first 2 input values from standard input
        int N = ___________________;
        double R = ___________________;
        
        // sets the size of the universe. note: there is a method to help you!
        ___________________;
        
        // Keep track of all of the relevant information about each particle.
        // The important information is: position of x, position of y,
        // velocity of x, velocity of y, mass, and the picture of the particle
        ___________________________; 
        ___________________________; 
        ___________________________; 
        ___________________________; 
        ___________________________; 
        ___________________________; 
        
        
        // Read the relevant information from the file
        ___________________________; 
        ...
        ___________________________; 
        
        
        // draw the universe background. note: there is a method to help you!
        ____________________________;
        
        // draw each particle in its initial position:
        ___________________________; 
        ...
        ___________________________; 
        
        
        
    }
    
}
