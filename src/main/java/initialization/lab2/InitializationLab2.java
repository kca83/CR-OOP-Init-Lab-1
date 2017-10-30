package initialization.lab2;

import initialization.lab1.ColorfulThing;

public class InitializationLab2 {
    public static void main(String[] args) {
        ThingContainer myThings = new ThingContainer(3);
        ThingContainer myOtherThings = new ThingContainer(5);
        ThingContainer mySpecialThings = new ThingContainer(2);

        for(int i = 0; i < myThings.getColorfulThings().length; i++) {
            myThings.add(ColorfulThing.getRandomColorfulThing());
        }
        myThings.add(ColorfulThing.getRandomColorfulThing());

        myOtherThings.add(ColorfulThing.getRandomColorfulThing());

        mySpecialThings.add(ColorfulThing.getRandomColorfulThing());
        mySpecialThings.add(ColorfulThing.getRandomColorfulThing());

        myThings.printThings();
        System.out.println();
        myOtherThings.printThings();
        System.out.println();
        mySpecialThings.printThings();
    }
}
