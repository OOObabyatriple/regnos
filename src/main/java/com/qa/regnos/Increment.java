package com.qa.regnos;

public class Increment {

    public int findNextValue(int twodgcode ) {
        if (twodgcode>50){
            return twodgcode-49;
        }
        else return twodgcode+50;
    }
}
