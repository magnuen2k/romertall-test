import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomertallTest {

    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    public void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    private String toRoman(int i) {
        String res = "";
        if (i == 1){
            res = "I";
        }
        if (i == 2){
            res = "II";
        }

        return res;
    }

}
