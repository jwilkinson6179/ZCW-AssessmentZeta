package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input)
    {
        Integer palindromeCount = 0;

        for(Integer idxStart = 0; idxStart < input.length(); idxStart++)
        {
            for(Integer idxEnd = idxStart + 1; idxEnd <= input.length(); idxEnd++)
            {
                String substring = input.substring(idxStart, idxEnd);
                if(substring.equals(BasicStringUtils.reverse(substring)))
                {
                    palindromeCount++;
                }
            }
        }

        return palindromeCount;
    }
}
