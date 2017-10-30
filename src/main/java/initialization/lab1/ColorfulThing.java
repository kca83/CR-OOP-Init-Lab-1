package initialization.lab1;

public class ColorfulThing {

    private Color color;

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE,
        PINK,
        BROWN,
        GRAY,
        BLACK
    }
}
