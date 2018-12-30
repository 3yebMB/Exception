public class MyArrayDataException extends Exception {
    private int a = 0;
    private int b = 0;

    public MyArrayDataException(String message, int a, int b)  {
        super(message + a + " " + b);
//        this.a = a;
//        this.b = b;
    }
}
