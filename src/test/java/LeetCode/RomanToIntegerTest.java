package LeetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger rti;

    @BeforeEach
    public  void AMethod()
    {
        rti = new RomanToInteger();
    }



    @Test
    @DisplayName("Tripple I = 3")
    public void tripleI()
    {
        Assertions.assertEquals(3,rti.romanToInt("III"));
    }

    @Test
    @DisplayName("LVIII = 58")
    public void LVIII()
    {
        Assertions.assertEquals(58,rti.romanToInt("LVIII"));
    }
    @Test
    @DisplayName("MCMXCIV = 1994")
    public void MCMXCIV()
    {
        Assertions.assertEquals(1994,rti.romanToInt("MCMXCIV"));
    }


}