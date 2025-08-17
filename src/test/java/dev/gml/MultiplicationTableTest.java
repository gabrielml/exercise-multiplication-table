/**
 * @file This is the 'test class' where I will verify my logic.
 * @author gml <kickAssDeveloper@hugsForMyBugs.mock>
 */
package dev.gml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test suit for the {@link MultiplicationTable} class, ensuring its
 * functionality behaves as expected.
 */
public class MultiplicationTableTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    private static Stream<Arguments> provideMultiplicationTableData() {
        String lineSeparator = System.lineSeparator();

        return Stream.of(
                Arguments.of(5, "5 x 1 = 5" + lineSeparator +
                        "5 x 2 = 10" + lineSeparator +
                        "5 x 3 = 15" + lineSeparator +
                        "5 x 4 = 20" + lineSeparator +
                        "5 x 5 = 25" + lineSeparator +
                        "5 x 6 = 30" + lineSeparator +
                        "5 x 7 = 35" + lineSeparator +
                        "5 x 8 = 40" + lineSeparator +
                        "5 x 9 = 45" + lineSeparator +
                        "5 x 10 = 50" + lineSeparator),
                Arguments.of(2, "2 x 1 = 2" + lineSeparator +
                        "2 x 2 = 4" + lineSeparator +
                        "2 x 3 = 6" + lineSeparator +
                        "2 x 4 = 8" + lineSeparator +
                        "2 x 5 = 10" + lineSeparator +
                        "2 x 6 = 12" + lineSeparator +
                        "2 x 7 = 14" + lineSeparator +
                        "2 x 8 = 16" + lineSeparator +
                        "2 x 9 = 18" + lineSeparator +
                        "2 x 10 = 20" + lineSeparator));
    }

    @ParameterizedTest
    @MethodSource("provideMultiplicationTableData")
    @DisplayName("1. It should print the multiplication table by five.")
    void testPrintTable(int number, String expectedOutput) {
        MultiplicationTable table = new MultiplicationTable();

        table.printTable(number);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

}
