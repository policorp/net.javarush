package com.javarush.test.level09.lesson11.home07;

/* Move static modifies
Move static modifiers so the code compiles.
*/

public class Solution
{
    static public int A = 5;
    static public int B = 2 * A;
    public int C = A * B;
    static public int D = A * B;

    public void main(String[] args)
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}
