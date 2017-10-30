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

    public ColorfulThing pop() {
        ColorfulThing thingToRemove = null;
        if(nextIndexToAdd > 0) {
            thingToRemove = colorfulThings[nextIndexToAdd - 1];
            colorfulThings[nextIndexToAdd - 1] = null;
            nextIndexToAdd--;
        }
        return thingToRemove;
    }

    public ColorfulThing remove(ColorfulThing.Color color) {
        ColorfulThing thingToRemove = null;
        int indexToRemove = 0;
        for(int i = 0; i < colorfulThings.length; i++) {
            if(colorfulThings[i] != null) {
                if(colorfulThings[i].getColor().equals(color)) {
                    thingToRemove = colorfulThings[i];
                    indexToRemove = i;
                    i = colorfulThings.length;
                }
            }
        }

        if(thingToRemove != null) {
            shiftAfterRemoved(indexToRemove);
        }

        return thingToRemove;
    }

    public ColorfulThing remove(ColorfulThing thing) {
        ColorfulThing thingToRemove = null;
        int indexToRemove = 0;
        for(int i = 0; i < colorfulThings.length; i++) {
            if(colorfulThings[i] != null) {
                if(colorfulThings[i].equals(thing)) {
                    thingToRemove = colorfulThings[i];
                    indexToRemove = i;
                    i = colorfulThings.length;
                }
            }
        }

        if(thingToRemove != null) {
            shiftAfterRemoved(indexToRemove);
        }

        return thingToRemove;
    }

    private void shiftAfterRemoved(int indexToRemove) {
        for(int i=indexToRemove+1; i < colorfulThings.length; i++) {
            colorfulThings[i - 1] = colorfulThings[i];
        }
        colorfulThings[colorfulThings.length - 1] = null;
        nextIndexToAdd--;
    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }
}
