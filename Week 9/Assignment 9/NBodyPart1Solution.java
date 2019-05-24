/* *****************************************************************************
 *  Name:    
 *
 *  Description: Write a number of methods as specified in the assigment.
 *
 ******************************************************************************/

public class NBodyPart1Solution {

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

        
    }

}
