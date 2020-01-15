package OCA.chapter_4.autoboxing;

public class TooManyConversions {


//    public static void play(Long l) {
//    }

//    public static void play(int l) {
//    }

    public static void play(Object l) {
    }

    public static void play(Long... l) {
    }

    public static void main(String[] args) {
        play(4);     // DOES NOT COMPILE
        play(4L);     // calls the Long version
    }
}


