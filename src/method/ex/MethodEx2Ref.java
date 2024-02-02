package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world";

        prinrMessgae(message, 3);
        prinrMessgae(message, 5);
        prinrMessgae(message, 7);
    }

    public static void prinrMessgae(String messgae, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(messgae);
        }
    }
}
