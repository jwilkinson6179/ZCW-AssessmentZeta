package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */

    // NOTE: Written to the test!  This absolutely DOES include 'n'
    public static Integer getSumOfN(Integer n)
    {
        Integer sum = 0;

        for(int i = 0; i <= n; i++)
        {
            sum += i;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */

    // NOTE: See above.  Testing absolutely includes 'n'
    public static Integer getProductOfN(Integer n)
    {
        if(n <= 0)
        {
            return 0;
        }

        Integer product = 1;

        for(Integer i = 1; i <= n; i++)
        {
            product *= i;
        }

        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val)
    {
        /*
        Boolean isNegative = false;
        Integer result;
        Integer[] resultToBeSummed = new Integer[1];

        if(val == 0)
        {
            return 0;
        }
        else if(val < 0)
        {
            isNegative = true;
        }

        Integer placeValue = 1;

        while(val != 0)
        {
            pushIntegerOnArray(((val % 10) * placeValue), resultToBeSummed);
            val /= 10;
        }

        result = IntegerArrayUtils.getSum(resultToBeSummed);

        if(isNegative)
        {
            result *= 1;
        }

        return result;

         I'll do this the right way later
        Prob split it up as individual vals in an array, then go backwards from array multiplying each value by it's
        place then summing


         */

        String integersReversedAsString = BasicStringUtils.reverse(val.toString());
        return Integer.valueOf(integersReversedAsString);
    }

    public static Integer[] pushIntegerOnArray(Integer value, Integer[] arrayOfIntegers)
    {
        Integer[] result = new Integer[arrayOfIntegers.length + 1];

        for(Integer i = 0; i < arrayOfIntegers.length; i++)
        {
            result[i] = arrayOfIntegers[i];
        }

        result[result.length - 1] = value;

        return result;
    }
}


