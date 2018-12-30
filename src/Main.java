public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[SIZE][SIZE];
        String[][] arr2 = new String[SIZE+1][SIZE+1];
        String[][] arr3 = new String[SIZE-1][SIZE+1];

        for (int i=0; i<SIZE; i++)
            for (int y=0; y<SIZE; y++){
            arr[i][y] = Integer.toString(i) + Integer.toString(y);
        }

        //arr[1][3] = "-";

        System.out.println("Сумма эелементов массива = "getArr(arr));
        //getArr(arr3);
    }

    public static int getArr(String[][] str) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        int a, b;

        if (str.length < SIZE)
            throw new MyArraySizeException("Маловато будет!");
        else if (str.length > SIZE)
            throw new MyArraySizeException("Перебор!");

        for (int i=0; i<SIZE; i++)
            for (int y=0; y<SIZE; y++){
                char ch[] = str[i][y].toCharArray();
                if (!(Character.isDigit(ch[0]) || Character.isDigit(ch[1])))
                    throw new MyArrayDataException("В массиве присутствует неверный симпол, в ячейке ", i, y);
                else
                    sum += Integer.parseInt(str[i][y]);
            }
        return sum;
    }
}
