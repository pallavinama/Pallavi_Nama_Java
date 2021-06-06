package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConverterSwitchTest {
    private ConverterSwitch convSwitch = new ConverterSwitch();

    @Test
    public void shouldReturnNameOfTheMonthWithCorrespondingNumberInSwitch() {
        String failMessage = "Mismatch between Expected and Actual Result";
        assertEquals(failMessage, "January", convSwitch.convertMonth(1));
        assertEquals(failMessage, "February", convSwitch.convertMonth(2));
        assertEquals(failMessage, "March", convSwitch.convertMonth(3));
        assertEquals(failMessage, "April", convSwitch.convertMonth(4));
        assertEquals(failMessage, "May", convSwitch.convertMonth(5));
        assertEquals(failMessage, "June", convSwitch.convertMonth(6));
        assertEquals(failMessage, "July", convSwitch.convertMonth(7));
        assertEquals(failMessage, "August", convSwitch.convertMonth(8));
        assertEquals(failMessage, "September", convSwitch.convertMonth(9));
        assertEquals(failMessage, "October", convSwitch.convertMonth(10));
        assertEquals(failMessage, "November", convSwitch.convertMonth(11));
        assertEquals(failMessage, "December", convSwitch.convertMonth(12));
    }

    @Test
    public void shouldReturnNameOfTheDayWithCorrespondingNumber() {
        String failMessage = "Mismatch between Expected and Actual Result";
        assertEquals(failMessage, "Sunday", convSwitch.convertDay(1));
        assertEquals(failMessage, "Monday", convSwitch.convertDay(2));
        assertEquals(failMessage, "Tuesday", convSwitch.convertDay(3));
        assertEquals(failMessage, "Wednesday", convSwitch.convertDay(4));
        assertEquals(failMessage, "Thursday", convSwitch.convertDay(5));
        assertEquals(failMessage, "Friday", convSwitch.convertDay(6));
        assertEquals(failMessage, "Saturday", convSwitch.convertDay(7));

    }
}