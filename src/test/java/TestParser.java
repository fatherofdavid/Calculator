import com.annapolisworks.ExpressionParser;
import com.annapolisworks.OpNode;

import org.junit.Assert;
import org.junit.Test;

public class TestParser {
    @Test
    public void parseNumberTest() {
        ExpressionParser test = new ExpressionParser();
        OpNode testNode = test.parse("12.6 + 3.4  *3");
        Assert.assertEquals("0.0,+,12.6",testNode.toString());
        Assert.assertEquals("12.6,+,3.4",testNode.nextNode.toString());
        Assert.assertEquals("3.4,*,3.0",testNode.nextNode.nextNode.toString());
    }

}
