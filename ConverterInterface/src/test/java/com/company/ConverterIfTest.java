package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterIfTest {


        private ConverterIf conv = new ConverterIf();

        @Test
        public void shouldReturnNameOfTheMonthWithCorrespondingNumber() {
            String failMessage = "Mismatch between Expected and Actual Result.";
            assertEquals(failMessage, "January", conv.convertMonth(1));
            assertEquals(failMessage, "February", conv.convertMonth(2));
            assertEquals(failMessage, "March", conv.convertMonth(3));
            assertEquals(failMessage, "April", conv.convertMonth(4));
            assertEquals(failMessage, "May", conv.convertMonth(5));
            assertEquals(failMessage, "June", conv.convertMonth(6));
            assertEquals(failMessage, "July", conv.convertMonth(7));
            assertEquals(failMessage, "August", conv.convertMonth(8));
            assertEquals(failMessage, "September", conv.convertMonth(9));
            assertEquals(failMessage, "October", conv.convertMonth(10));
            assertEquals(failMessage, "November", conv.convertMonth(11));
            assertEquals(failMessage, "December", conv.convertMonth(12));
        }

    @Test
         public void shouldReturnNameOfTheWeekWithCorrespondingNumber() {
        String failMessage = "Mismatch between Expected and Actual Result";
        assertEquals(failMessage, "Sunday", conv.convertDay(1));
        assertEquals(failMessage, "Monday", conv.convertDay(2));
        assertEquals(failMessage, "Tuesday", conv.convertDay(3));
        assertEquals(failMessage, "Wednesday", conv.convertDay(4));
        assertEquals(failMessage, "Thursday", conv.convertDay(5));
        assertEquals(failMessage, "Friday", conv.convertDay(6));
        assertEquals(failMessage, "Saturday", conv.convertDay(7));

    }
}