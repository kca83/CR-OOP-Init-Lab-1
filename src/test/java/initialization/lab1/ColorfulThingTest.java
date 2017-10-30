package initialization.lab1;

import org.junit.Assert;
import org.junit.Test;

public class ColorfulThingTest {

    @Test
    public void getColorTest() {
        ColorfulThing cup = new ColorfulThing("blue");
        String expected = "blue";
        String actual = cup.getColor();
        Assert.assertEquals(expected, actual);
    }
}
