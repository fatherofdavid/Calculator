import com.annapolisworks.Expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution {
    @Test
    public void parseNumberTest() {
        String userInputStr = "1 + 2^2 * 3 -5 +2*3^ 2";
        Expression myExpression = new Expression(userInputStr);
        double solution = myExpression.getValue();
        assertEquals(26, solution, .01);
    }
}

    /*
    solution step by step:
    1 + 2^2 * 3 -5 +2*3^ 2
    1 + 4*3 - 5 + 2*9
    1 + 12 - 5 + 18
    26
    */