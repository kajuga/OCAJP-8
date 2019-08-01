package chapter_4;

public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";

    public MouseHouse(int length, int width, int height) {
        this.volume = length * width * height;
    }
}
