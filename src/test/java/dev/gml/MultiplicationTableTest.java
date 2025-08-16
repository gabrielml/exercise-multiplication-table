/**
 * @file This is the 'test class' where I will verify my logic.
 * @author gml <kickAssDeveloper@hugsForMyBugs.mock>
 */
package dev.gml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suit for the {@link MultiplicationTable} class, ensuring its
 * functionality behaves as expected.
 */
public class MultiplicationTableTest {
    // ATTRIBUTES (aka fields)
    // Captures output sent to the console.
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    // METHODS
    @BeforeEach
    public void setUp() {
        // It redirects 'System.out' to 'outputStreamCaptor', so I can capture
        // everything that is printed
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("1. It should print the multiplication table by five.")
    void testPrintTableForFive() {
        // --- Given ---
        // A multiplication table, a selected number (e.g. 5), and the expected console
        // output.
        MultiplicationTable table = new MultiplicationTable();
        int number = 5;
        String expectedOutput = "5 x 1 = 5\n" +
                "5 x 2 = 10\n" +
                "5 x 3 = 15\n" +
                "5 x 4 = 20\n" +
                "5 x 5 = 25\n" +
                "5 x 6 = 30\n" +
                "5 x 7 = 35\n" +
                "5 x 8 = 40\n" +
                "5 x 9 = 45\n" +
                "5 x 10 = 50\n";

        // --- When ---
        // I call the multiplication table by 5 to be printed on the console.
        table.printTable(number);

        // --- Then ---
        // I confirm that the actual console output is the same as the expected console
        // output.
        assertEquals(expectedOutput, outputStreamCaptor.toString().replace("\r", ""));
    }

    @Test
    @DisplayName("2. It should return the multiplication table for a number as a string.")
    void testGenerateTableString() throws Exception {
        // --- Given ---
        // A multiplication table instance, a number, and the expected string output.
        MultiplicationTable table = new MultiplicationTable();
        int number = 2;
        String expectedOutput = "2 x 1 = 2" + System.lineSeparator() +
                "2 x 2 = 4" + System.lineSeparator() +
                "2 x 3 = 6" + System.lineSeparator() +
                "2 x 4 = 8" + System.lineSeparator() +
                "2 x 5 = 10" + System.lineSeparator() +
                "2 x 6 = 12" + System.lineSeparator() +
                "2 x 7 = 14" + System.lineSeparator() +
                "2 x 8 = 16" + System.lineSeparator() +
                "2 x 9 = 18" + System.lineSeparator() +
                "2 x 10 = 20" + System.lineSeparator();

        // --- When ---
        // The 'generateTableString' method is called.
        String actualOutput = table.generateTableString(number);

        // --- Then ---
        // I confirm that the actual string output is the same as the expected string.
        assertEquals(expectedOutput, actualOutput);
    }

}
