package com.javapractice.hackerrank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AngryProfessorTest {
    @Test
    public void cancelsWhenNumStudentsLessThanRequired() throws Exception {
        int[] arrivalTimes = {1, -1};
        Assert.assertTrue(AngryProfessor.shouldCancel(arrivalTimes, 2));
    }

    @Test
    public void doesNotCancelWhenNumStudentsEqualToRequired() throws Exception {
        int[] arrivalTimes = {10, 0, -1};
        Assert.assertFalse(AngryProfessor.shouldCancel(arrivalTimes, 2));
    }
}
