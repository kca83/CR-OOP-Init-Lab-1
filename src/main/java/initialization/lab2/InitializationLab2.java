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
        ColorfulThing blueThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        myOtherThings.add(blueThing);
        myOtherThings.add(ColorfulThing.getRandomColorfulThing());
        myOtherThings.add(ColorfulThing.getRandomColorfulThing());
        myOtherThings.add(new ColorfulThing(ColorfulThing.Color.PINK));

        mySpecialThings.add(ColorfulThing.getRandomColorfulThing());
        mySpecialThings.add(ColorfulThing.getRandomColorfulThing());

        myThings.printThings();
        System.out.println();
        myOtherThings.printThings();
        System.out.println();
        mySpecialThings.printThings();
        System.out.println();

        System.out.println("Popped");
        myThings.pop();
        myThings.printThings();
        System.out.println();
        System.out.println("Remove pink thing");
        System.out.println("Remove blue thing");
        myOtherThings.remove(ColorfulThing.Color.PINK);
        myOtherThings.remove(blueThing);
        myOtherThings.printThings();
        System.out.println();

        System.out.println("Popped too many times");
        mySpecialThings.pop();
        mySpecialThings.pop();
        System.out.println(mySpecialThings.pop());
        System.out.println();

        ColorfulThing[] rainbowThings = {new ColorfulThing(ColorfulThing.Color.RED),
                new ColorfulThing(ColorfulThing.Color.ORANGE), new ColorfulThing(ColorfulThing.Color.YELLOW),
                new ColorfulThing(ColorfulThing.Color.GREEN), new ColorfulThing(ColorfulThing.Color.BLUE),
                new ColorfulThing(ColorfulThing.Color.PURPLE)};
        ThingContainer allMyThings = new ThingContainer(rainbowThings);
        allMyThings.printThings();

    }
}
