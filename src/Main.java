public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) throws MyArraySizeException {

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

        System.out.println(calcutaleBMI(float height, float weight));
    }

    public static float calcutaleBMI(float a, float b){
        
    }

    public static void getArr(String[][] str) throws MyArraySizeException{
        if (str.length < SIZE)
            throw new MyArraySizeException("Маловато будет!");
        else if (str.length > SIZE)
            throw new MyArraySizeException("Перебор!");
    }
}
