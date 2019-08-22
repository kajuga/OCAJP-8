package chapter_4.exam;

public class Order {
    static String result = "";
    {
        result += "c";
    }
    static {
        result += "u";
    }

    {
        result += "r";
    }
}
