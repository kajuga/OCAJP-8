package OCA.chapter_5.intefaces;

public class SashokReal extends SashokAbstract implements Saashok {

    @Override
    public void print() {

    }

    public static void main(String[] args) {
        System.out.println(Saashok.Z);
        SashokReal sr = new SashokReal();
        sr.rubber();

    }



}
