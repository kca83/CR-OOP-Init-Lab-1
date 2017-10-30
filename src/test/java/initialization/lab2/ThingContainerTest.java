package initialization.lab2;

import initialization.lab1.ColorfulThing;
import org.junit.Assert;
import org.junit.Test;

public class ThingContainerTest {

    @Test
    public void addTest() {
        ThingContainer myThings = new ThingContainer(3);
        ColorfulThing blanket = new ColorfulThing(ColorfulThing.Color.PURPLE);
        myThings.add(blanket);

        ColorfulThing expected = blanket;
        ColorfulThing actual = myThings.getColorfulThings()[0];

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTooManyTest() {
        ThingContainer myThings = new ThingContainer(3);
        ColorfulThing blanket1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing blanket2 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing blanket3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing blanket4 = new ColorfulThing(ColorfulThing.Color.GREEN);
        myThings.add(blanket1);
        myThings.add(blanket2);
        myThings.add(blanket3);
        myThings.add(blanket4);

        ColorfulThing[] expected = {blanket1, blanket2, blanket3};
        ColorfulThing[] actual = myThings.getColorfulThings();
    }

    @Test
    public void popTest() {
        ThingContainer myThings = new ThingContainer(3);
        ColorfulThing blanket1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing blanket2 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing blanket3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        myThings.add(blanket1);
        myThings.add(blanket2);
        myThings.add(blanket3);

        ColorfulThing expected = blanket3;
        ColorfulThing actual = myThings.pop();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(null, myThings.getColorfulThings()[2]);
    }

    @Test
    public void removeByColorTest() {
        ThingContainer myThings = new ThingContainer(3);
        ColorfulThing blanket1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing blanket2 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing blanket3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        myThings.add(blanket1);
        myThings.add(blanket2);
        myThings.add(blanket3);

        ColorfulThing expected = blanket2;
        ColorfulThing actual = myThings.remove(ColorfulThing.Color.PINK);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(null, myThings.getColorfulThings()[myThings.getColorfulThings().length-1]);
    }

    @Test
    public void removeByObjectTest() {
        ThingContainer myThings = new ThingContainer(3);
        ColorfulThing blanket1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing blanket2 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing blanket3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        myThings.add(blanket1);
        myThings.add(blanket2);
        myThings.add(blanket3);

        ColorfulThing expected = blanket2;
        ColorfulThing actual = myThings.remove(blanket2);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(null, myThings.getColorfulThings()[myThings.getColorfulThings().length-1]);
    }
}
