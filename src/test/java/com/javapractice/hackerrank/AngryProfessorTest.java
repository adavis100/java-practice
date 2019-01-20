package com.javapractice.hackerrank;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AngryProfessorTest {
    @Test
    void cancelsWhenNumStudentsLessThanRequired()  {
        int[] arrivalTimes = {1, -1};
        assertTrue(AngryProfessor.shouldCancel(arrivalTimes, 2));
    }

    @Test
    void doesNotCancelWhenNumStudentsEqualToRequired()  {
        int[] arrivalTimes = {10, 0, -1};
        assertFalse(AngryProfessor.shouldCancel(arrivalTimes, 2));
    }
}
