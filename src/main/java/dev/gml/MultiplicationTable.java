package dev.gml;

public class MultiplicationTable {

    // METHODS
    public void printTable(int number) {
        for (int index = 1; index <= 10; index++) {
            int result = number * index;
            System.out.println(number + " x " + index + " = " + result);
        }
    }
}