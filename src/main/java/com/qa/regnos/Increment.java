package com.qa.regnos;

import java.text.DecimalFormat;

public class Increment {

    public String findNextValue( int twodgcode ) {
        DecimalFormat df=new DecimalFormat("00");
        if (twodgcode>50){
            int change=twodgcode-49;
            String answer = df.format(change);
            //String answer = String.format(String.valueOf(change),"%02d" );
            return answer;
        }
        else{
            int change = twodgcode+50;
            String answer = df.format(change);
            //String answer = String.format(String.valueOf(change),"%02d" );
            return answer;
        }
    }
}
