package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)
    {
        Integer count = 0;

        for(Object element : objectArray) {
            if (element.equals(objectToCount))
            {
                count++;
            }
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove)
    {
/*
        Object[] resultArray = new Object[1];

        for(Integer i = 0; i < objectArray.length; i++)
        {
            if(!objectArray[i].equals(objectToRemove))
            {
                pushOnArray(objectToRemove, resultArray);
            }
        }


 */
        // TODO: Return to this
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray)
    {
        Object mostCommonObj = objectArray[0];
        Integer highestOccurrences = getNumberOfOccurrences(objectArray, mostCommonObj);

        for(int i = 1; i < objectArray.length; i++)
        {
            if(highestOccurrences < getNumberOfOccurrences(objectArray, objectArray[i]))
            {
                mostCommonObj = objectArray[i];
                highestOccurrences = getNumberOfOccurrences(objectArray, objectArray[i]);
            }
        }

        return mostCommonObj;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommonObj = objectArray[0];
        Integer highestOccurrences = getNumberOfOccurrences(objectArray, leastCommonObj);

        for(int i = 1; i < objectArray.length; i++)
        {
            if(highestOccurrences > getNumberOfOccurrences(objectArray, objectArray[i]))
            {
                leastCommonObj = objectArray[i];
                highestOccurrences = getNumberOfOccurrences(objectArray, objectArray[i]);
            }
        }

        return leastCommonObj;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        /*
        Object[] mergedArrays = new Object[objectArray.length + objectArrayToAdd.length];

        for(Integer i = 0; i < objectArray.length; i++)
        {
            mergedArrays[i] = objectArray[i];
        }

        for(Integer i = 0; i < objectArrayToAdd.length; i++)
        {
            mergedArrays[i + objectArray.length - 1] = objectArrayToAdd[i];
        }

        return mergedArrays;
        */

        // TODO: Figure out autoboxing?
        return objectArray;
    }

    public static Object[] pushOnArray(Object newObject, Object[] array)
    {
        Object[] result = new Object[array.length + 1];

        for(Integer i = 0; i < array.length; i++)
        {
            result[i] = array[i];
        }

        result[result.length - 1] = newObject;

        return result;
    }
}
