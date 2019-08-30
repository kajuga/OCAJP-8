package chapter_5.intefaces;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
