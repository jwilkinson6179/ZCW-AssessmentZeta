package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input)
    {
        ArrayList<String> substrings = new ArrayList<>();
        Integer palindromeCount = 0;

        for(Integer idxStart = 0; idxStart < input.length(); idxStart++)
        {
            for(Integer idxEnd = idxStart + 1; idxEnd <= input.length(); idxEnd++)
            {
                substrings.add(input.substring(idxStart, idxEnd));
            }
        }

        for(String substring : substrings)
        {
            if(substring.equals(BasicStringUtils.reverse(substring)))
            {
                palindromeCount++;
            }
        }
        return palindromeCount;
    }
}
