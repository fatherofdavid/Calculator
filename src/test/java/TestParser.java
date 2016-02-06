import com.annapolisworks.ExpressionParser;
import com.annapolisworks.OpNode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestParser {
    @Test
    public void parseNumberTest() {
        ExpressionParser test = new ExpressionParser();
        OpNode testNode = test.parse("12.6 + 3.4  *3");
        assertEquals("0.0,+,12.6",testNode.toString());
        assertEquals("12.6,+,3.4",testNode.nextNode.toString());
        assertEquals("3.4,*,3.0",testNode.nextNode.nextNode.toString());
    }

}
