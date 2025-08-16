/**
 * @file This is the class I will written my logic in.
 * @author gml <kickAssDeveloper@hugsForMyBugs.mock>
 */
package dev.gml;

/**
 * A class that generates and prints a multiplication table for a given integer.
 */
public class MultiplicationTable {
    // --- ATTRIBUTES (aka fields) ---
    private static final int MULTIPLICATION_LIMIT = 10;

    // --- METHODS ---
    /**
     * Prints the multiplication table for a given number from 1 to 10.
     * The output is printed to the console in the format:
     * "number x index = result".
     * 
     * @param number The integer for which to generate the multiplication table.
     */
    public void printTable(int number) {
        StringBuilder output = new StringBuilder();

        for (int index = 1; index <= MULTIPLICATION_LIMIT; index++) {
            int result = number * index;

            output.append(number).append(" x ").append(index).append(" = ").append(result)
                    .append(System.lineSeparator());
        }
        System.out.print(output);
    }
}