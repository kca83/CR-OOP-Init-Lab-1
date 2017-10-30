package initialization.lab1;


public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing chair = new BoringThing();
        BoringThing table = new BoringThing();
        BoringThing rug = new BoringThing();
        BoringThing bookshelf = new BoringThing();
        BoringThing window = new BoringThing();

        ColorfulThing blanket = new ColorfulThing("pink");
        ColorfulThing cdCase = new ColorfulThing("brown");
        ColorfulThing backpack = new ColorfulThing("black");
        ColorfulThing wiimote = new ColorfulThing("green");
        ColorfulThing laptop = new ColorfulThing("blue");

        System.out.println(blanket.getColor());
        System.out.println(cdCase.getColor());
        System.out.println(backpack.getColor());
        System.out.println(wiimote.getColor());
        System.out.println(laptop.getColor());

        //ColorfulThing error = new ColorfulThing();
    }
}
