/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateRemoverTest {

    @Test
    public void testEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testNoDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 2, 3));
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testStringDuplicates() {
        ArrayList<String> input = new ArrayList<>(List.of("A", "A", "B"));
        ArrayList<String> expected = new ArrayList<>(List.of("A", "B"));
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testMultipleDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 1, 3, 3, 5, 5));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 3, 5));
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }
}