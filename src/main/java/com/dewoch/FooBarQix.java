package com.dewoch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boris on 16/01/2017.
 */
public class FooBarQix {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){

            System.out.println(calculate(i));
        }

    }



    public static String calculate(int i) {

        String result = "";
        boolean isResultNumber = true;


        if(i % 3 == 0){

            isResultNumber = false;
            result += "Foo";

        }

        if(i % 5 == 0){

            isResultNumber = false;
            result += "Bar";

        }

        if(i % 7 == 0){

            isResultNumber = false;
            result += "Qix";

        }


        for(int j = 0; j < String.valueOf(i).length(); j++) {

            if(String.valueOf(i).charAt(j) == '3'){

                isResultNumber = false;
                result += "Foo";

            }

            if(String.valueOf(i).charAt(j) == '5'){

                isResultNumber = false;
                result += "Bar";

            }

            if(String.valueOf(i).charAt(j) == '7'){

                isResultNumber = false;
                result += "Qix";

            }

        }



        if(isResultNumber){

            result = String.valueOf(i);

        }

        return result;
    }
}
