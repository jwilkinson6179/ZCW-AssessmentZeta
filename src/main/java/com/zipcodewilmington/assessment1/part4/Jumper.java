package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight)
    {
        if(jumpHeight <= 1)
        {
            return flagHeight;
        }
        else {
            Integer bigJumps = flagHeight / jumpHeight;
            Integer littleJumps = flagHeight - (bigJumps * jumpHeight);

            return bigJumps + littleJumps;
        }
    }
}
