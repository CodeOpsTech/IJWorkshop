package start;

public class Color {
    int red, green, blue;
    void Color() {
        red = 10;
        blue = 20;
        green = 30;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

    public static void main(String[] args) {
        Color color = new Color();
        System.out.println("color = " + color);
    }
}
