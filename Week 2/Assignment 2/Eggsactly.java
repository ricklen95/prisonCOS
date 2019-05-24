/******************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: A typical egg carton holds 12 eggs. Write a program that
 * takes an integer command-line argument representing the number
 * of eggs your chickens have laid. Print two numbers: the number of
 * full cartons of eggs you can take to market, and the number of eggs
 * that will be left over. Hint: use %.
 *
 * Examples:
 * > java Eggsactly 12
 * 1 0
 * > java Eggsactly 27
 * 2 3
 *****************************************************************************/

public class Eggsactly {
    public static void main(String[] args) {

        // reads total number of eggs from args[0]
        // remember that args[0] is a String, so it must be converted to an int
        int n = ________;

        // calculate number of full egg cartons:
        int cartons = ________;

        // calculate number of leftover eggs:
        int leftover = ________;

        // print number of filled cartons
        System.out.println("There are " + ________ + " full cartons.");

        // print number of eggs left over
        System.out.println("There are " + ________ + " eggs left over.");
    }
}