package initialization.lab1;


public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing chair = new BoringThing();
        BoringThing table = new BoringThing();
        BoringThing rug = new BoringThing();
        BoringThing bookshelf = new BoringThing();
        BoringThing window = new BoringThing();

        ColorfulThing blanket = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing cdCase = new ColorfulThing(ColorfulThing.Color.BROWN);
        ColorfulThing backpack = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing wiimote = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing laptop = new ColorfulThing(ColorfulThing.Color.BLUE);

        System.out.println(blanket.getColor());
        System.out.println(cdCase.getColor());
        System.out.println(backpack.getColor());
        System.out.println(wiimote.getColor());
        System.out.println(laptop.getColor());
    }
}
