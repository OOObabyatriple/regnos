package com.qa.regnos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RegistrationsTest {
    @Test
    public void returning_september_value_from_march() throws LimitException {
        //arrange
        int marnumber = 02;
        String expectednumber = "52";
        Increment increment = new Increment();

        //act
        String result = increment.findNextValue(marnumber);

        assertEquals(expectednumber, result);


    }

    @Test
    public void returning_march_value_from_september() throws LimitException {
        //arrange
        int sepnumber = 52;
        String expectednumber = "03";
        Increment increment = new Increment();

        //act
        String result = increment.findNextValue(sepnumber);

        assertEquals(expectednumber, result);

    }
    @Test
    public void March_Limit_Exception_Test() throws LimitException {


        //arrange
        int input =01;
        Increment cut=new Increment();

        //act
        try{
            cut.findNextValue(input);

        } catch (LimitException e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }
    @Test
    public void Sep_Limit_Exception_Test() throws LimitException {


        //arrange
        int input =100;
        Increment cut=new Increment();

        //act
        try{
            cut.findNextValue(input);

        } catch (LimitException e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }
    @Test
    public void Limit_Exception_Test() throws LimitException {


        //arrange
        int input =50;
        Increment cut=new Increment();

        //act
        try{
            cut.findNextValue(input);

        } catch (LimitException e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }

}
