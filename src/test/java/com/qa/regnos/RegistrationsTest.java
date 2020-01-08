package com.qa.regnos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegistrationsTest {
    @Test
    public void returning_september_value_from_march(){
        //arrange
        int marnumber = 02;
        int expectednumber=52;
        Increment increment = new Increment();

        //act
       int result = increment.findNextValue(marnumber);

        assertEquals(expectednumber,result);



    }
    @Test
    public void returning_march_value_from_september(){
        //arrange
        int sepnumber = 52;
        int expectednumber=03;
        Increment increment = new Increment();

        //act
        int result = increment.findNextValue(sepnumber);

        assertEquals(expectednumber,result);



    }
}
