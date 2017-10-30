package initialization.lab1;

import org.junit.Assert;
import org.junit.Test;

public class ColorfulThingTest {

    @Test
    public void getColorTest() {
        ColorfulThing cup = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing.Color expected = ColorfulThing.Color.BLUE;
        ColorfulThing.Color actual = cup.getColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRandomColorfulThingTest() {
        ColorfulThing newThing = ColorfulThing.getRandomColorfulThing();
        Assert.assertTrue(newThing instanceof ColorfulThing);
    }
}
