import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomertallTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", toRoman(3));
    }

    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldConvert5ToV() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldConvert10ToX() {
        assertEquals("X", toRoman(10));
    }

    @Test
    void shouldConvert40ToXL() {
        assertEquals("XL", toRoman(40));
    }

    @Test
    void shouldConvert50ToL() {
        assertEquals("L", toRoman(50));
    }

    private String toRoman(int i) {
        String res = "";

        while (i >= 50) {
            res += "L";
            i -= 50;
        }

        while (i >= 40) {
            res += "XL";
            i -= 40;
        }

        while (i >= 10) {
            res += "X";
            i -= 10;
        }

        while (i >= 9) {
            res += "IX";
            i -= 9;
        }

        while (i >= 5) {
            res += "V";
            i -= 5;
        }

        while (i >= 4) {
            res += "IV";
            i -= 4;
        }

        for (int j = 0; j < i; i--) {
            res += "I";
        }
        return res;
    }
}