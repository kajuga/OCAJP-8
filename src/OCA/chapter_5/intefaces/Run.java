package OCA.chapter_5.intefaces;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
