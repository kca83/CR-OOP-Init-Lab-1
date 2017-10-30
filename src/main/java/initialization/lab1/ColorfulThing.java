package initialization.lab1;

import java.util.Random;

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

    public static ColorfulThing getRandomColorfulThing() {
        Random rand = new Random();
        Color randomColor = Color.values()[rand.nextInt(Color.values().length)];
        return new ColorfulThing(randomColor);
    }
}
