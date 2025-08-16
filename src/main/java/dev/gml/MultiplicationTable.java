package dev.gml;

public class MultiplicationTable {

    // --- METHODS ---
    public void printTable(int number) {
        StringBuilder output = new StringBuilder();

        for (int index = 1; index <= 10; index++) {
            int result = number * index;

            output.append(number).append(" x ").append(index).append(" = ").append(result)
                    .append(System.lineSeparator());
        }
        System.out.print(output);
    }
}