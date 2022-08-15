package LeetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

    ShuffleString ss;

    @BeforeEach
    public  void someMethod()
    {
        ss = new ShuffleString();
    }

    @Test
    public  void ShuffleStringTest()
    {

        String input = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        Assertions.assertEquals("leetcode",ss.restoreString(input, indices) );
    }


}