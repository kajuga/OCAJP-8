package chapter_5.intefaces;

public interface Saashok {
    int Z = 3;

    void print();
    default int something (int z) {
        return 2;
    }

}
