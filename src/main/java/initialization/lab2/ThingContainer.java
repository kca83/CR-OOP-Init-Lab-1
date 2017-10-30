package initialization.lab2;

import initialization.lab1.ColorfulThing;

public class ThingContainer {
    private int nextIndexToAdd = 0;
    private ColorfulThing[] colorfulThings;

    public ThingContainer(int numThings) {
        colorfulThings = new ColorfulThing[numThings];
    }

    public void add(ColorfulThing colorfulThing) {
        if(nextIndexToAdd < colorfulThings.length) {
            colorfulThings[nextIndexToAdd] = colorfulThing;
            nextIndexToAdd++;
        }
        else {
            System.out.println(this.getClass().getSimpleName() + " is full");
        }
    }

    public void printThings() {
        for(ColorfulThing thing: colorfulThings) {
            if(thing != null) {
                System.out.println("This thing is " + thing.getColor());
            }
        }
    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }
}
