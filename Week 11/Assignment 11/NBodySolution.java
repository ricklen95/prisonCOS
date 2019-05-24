/* *****************************************************************************
 *  Name:    
 *
 *  Description: 1. Reads two double command-line arguments T and deltaT.
 *               2. Reads in the universe from standard input using StdIn,
 *                  using several parallel arrays to store the data.
 *               3. Simulates the universe, starting at time t = 0.0,
 *                  and continuing as long as t < T, using the leapfrog
 *                  scheme described below.
 *               4. Animates the results to standard drawing using StdDraw.
 *
 ******************************************************************************/

public class NBodySolution {

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

        // read commandline args T and deltaT
        double T = Double.parseDouble(args[0]);
        double deltaT = Double.parseDouble(args[1]);

        // declares double t, sets to 0
        double t = 0.0;

        // declares and sets gravitational constant
        double g = 6.67e-11;

        // declares string "background" for background image
        String background = "starfield.jpg";

        // read the first 2 input values from the input
        int N = StdIn.readInt();
        double R = StdIn.readDouble();

        // sets the size of the universe
        setUniverse(R);

        // declare arrays for each category, each of which has
        // N elements, one for each particle
        double[] px = new double[N]; // array for position of x
        double[] py = new double[N]; // array for position of y
        double[] vx = new double[N]; // array for velocity of x
        double[] vy = new double[N]; // array for velocity of y
        double[] mass = new double[N]; // array for mass
        String[] picture = new String[N]; // array for pictures of particles


        // fills each array with input information
        for (int i = 0; i < N; i++) {

            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            picture[i] = StdIn.readString();

        }

        // draw the universe background
        drawUniverse(background);

        // draw each particle in its initial position:
        for (int i = 0; i < N; i++) {
            StdDraw.picture(px[i], py[i], picture[i]);
        }

        // Part 3: Update the universe at each time-step

        // The following while loop will allow us to calculate the
        // change in position for each particle (based on the force
        // from all other particles), and then redraw the background
        // and particles. The loop also tallies how much "time" 
        // has gone by so that once the time has summed to T, 
        // the program stops executing.

        while (t < T) {

            // declare new arrays for the
            // x and y components of the force
            double[] forcex = new double[N];
            double[] forcey = new double[N];

            // fills the arrays, with each element
            // corresponding to a different particle
            for (int i = 0; i < N; i++) {

                // runs through the particles, calculating the force
                // from each particle j on the particle i in question
                for (int j = 0; j < N; j++) {

                    // declares variables for x and y distances
                    double dx = (px[j] - px[i]);
                    double dy = (py[j] - py[i]);

                    // calculates the distance between planets i and j
                    double distance = calculateDistance(dx, dy);

                    // calculates the x and y components of the force between i and j
                    double forcej = calculateForce(mass[i], mass[j], g, distance);

                    // calculates x and y components of force between i and j
                    double forcejx = calculateForceX(dx, distance, forcej);
                    double forcejy = calculateForceY(dy, distance, forcej);

                    // calculates net force on particle i in x and y directions
                    forcex[i] = forcex[i] + forcejx;
                    forcey[i] = forcey[i] + forcejy;

                }
            }

            // draw the universe background
            drawUniverse(background);

            // calculate the new velocity and position for each particle
            for (int i = 0; i < N; i++) {

                // calculates acceleration in x and y directions
                double ax = calculateAcceleration(forcex[i], mass[i]);
                double ay = calculateAcceleration(forcey[i], mass[i]);

                // calculates velocity in x and y directions
                vx[i] = calculateVelocity(vx[i], deltaT, ax);
                vy[i] = calculateVelocity(vy[i], deltaT, ay);

                // calculates new x and y coordinates
                // to determine position
                px[i] = calculatePosition(px[i], deltaT, vx[i]);
                py[i] = calculatePosition(py[i], deltaT, vy[i]);

                // draws each particle in its new position
                StdDraw.picture(px[i], py[i], picture[i]);

            }

            // waits 40 milliseconds before continuing
            StdDraw.show();
            StdDraw.pause(20);

            // increments t by deltaT
            t = t + deltaT;

        }

    }

}
