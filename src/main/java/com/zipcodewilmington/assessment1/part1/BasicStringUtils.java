package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder(str.length());
        String firstCharacterUpperCase = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1, str.length());

        result.append(firstCharacterUpperCase).append(restOfString);

        return result.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();

        for(Integer i = str.length() - 1; i >= 0; i--)
        {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = reverse(str);
        result = camelCase(result);

        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str)
    {
        if(str.length() > 3) {
            return str.substring(1, str.length() - 1);
        }
        else
        {
            return "";
        }
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] arrayAsString = str.toCharArray();
        StringBuilder result = new StringBuilder(str.length());

        for(Character element : arrayAsString)
        {
            if(Character.isLowerCase(element))
            {
                result.append(Character.toUpperCase(element));
            }
            else
            {
                result.append(Character.toLowerCase(element));
            }
        }

        return result.toString();
    }
}
