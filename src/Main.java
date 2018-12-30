import java.util.Scanner;

public class Main {
    public static final int SIZE = 4;
    public static final float Underweight = 18.5f;
    public static final float Normalweight = 25.0f;
    public static final float Overweight = 30.0f;


    public static void main(String[] args) throws MyArraySizeException {

        Scanner scanner = new Scanner(System.in);
        float height, weight;

//        String[][] arr = new String[SIZE][SIZE];
//        String[][] arr2 = new String[SIZE+1][SIZE+1];
//        String[][] arr3 = new String[SIZE-1][SIZE+1];
//
//        for (int i=0; i<SIZE; i++)
//            for (int y=0; y<SIZE; y++){
//            arr[i][y] = Integer.toString(i) + Integer.toString(y);
//        }
//
//        getArr(arr2);
//        getArr(arr3);
        do {
            System.out.println("Введите рост и вес человека через пробел.");
            height = scanner.nextInt();
            weight = scanner.nextInt();
        } while (!isCellValid(height, weight));

        System.out.println(calcutaleBMI(height, weight));
    }

    private static boolean isCellValid(float x, float y){
        boolean result = true;

        if (x<0 || y<0)
            result = false;

        return result;
    }

    public static String calcutaleBMI(float a, float b){
        String result = "";

        if (a/(b*b) < Underweight)
            result = "" + a + " " + b + " under";
        else if (a/(b*b) < Normalweight)
            result = "" + a + " " + b + " normal";
        else if (a/(b*b) < Overweight)
            result = "" + a + " " + b + " over";
        else
            result = "" + a + " " + b + " obese";

        return result;
    }

    public static void getArr(String[][] str) throws MyArraySizeException{
        if (str.length < SIZE)
            throw new MyArraySizeException("Маловато будет!");
        else if (str.length > SIZE)
            throw new MyArraySizeException("Перебор!");
    }
}
