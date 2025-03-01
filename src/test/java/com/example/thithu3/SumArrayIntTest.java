package com.example.thithu3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayIntTest {
    @Test
    void testSumArrayInt() {
        SumArrayInt sumArrayInt = new SumArrayInt();
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        assertEquals(expectedSum, sumArrayInt.sumArray(array));
    }

    @Test
    void testSumArrayIntWithNegativeNumbers() {
        SumArrayInt sumArrayInt = new SumArrayInt();
        int[] array = {-1, -2, -3, -4, -5};
        int expectedSum = -15;
        assertEquals(expectedSum, sumArrayInt.sumArray(array));
    }

    @Test
    void testSumArrayIntWithZero() {
        SumArrayInt sumArrayInt = new SumArrayInt();
//        int[] array = {0, 0, 0, 0, 0};
//        int expectedSum = 0;
//        assertEquals(expectedSum, sumArrayInt.sumArray(array));

        assertThrows(IllegalArgumentException.class ,()->sumArrayInt.sumArray(new int[0]));
    }

    @Test
    void testSumArrayIntWithEmptyArray() {
        SumArrayInt sumArrayInt = new SumArrayInt();
//        int[] array = {};
//        int expectedSum = 0;
//        assertEquals(expectedSum, sumArrayInt.sumArray(array));
        assertThrows(IllegalArgumentException.class, ()-> sumArrayInt.sumArray(null));
    }

    @Test
    void testSumArrayIntWithOneElementArray() {
        SumArrayInt sumArrayInt = new SumArrayInt();
        int[] array = {5};
        int expectedSum = 5;
        assertEquals(expectedSum, sumArrayInt.sumArray(array));
    }

}