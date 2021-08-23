public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,6,8};
        String str = "The Wheel of Time";

        System.out.println(factorial(5)); // вычисление факториала

        System.out.println(factorialRecurs(5)); // вычисление факториала (через рекурсию)

        System.out.println(fibonacci(6)); // получение n-го числа Фибоначчи

        int[] newArray = reverse(array); // разворот массива / можно просто использовать reverse из коллекций

        String[] strArr = splitString(str," ");   //
        for (int i = 0; i < strArr.length; i++) {       //      Разбиение строки
            System.out.println(strArr[i]);              //
        }                                               //

        Page newPage = new Page.Builder()                               //builder
                .withUrl("https://wot.fandom.com/")
                .build();

        Page newPage2 = new Page.Builder()
                .withUrl("https://harrypotter.fandom.com/")
                .withProxy("proxy")
                .build();

        DBCon connection;                                               //singleton
        connection = DBCon.getInstance();
        connection.query();

        DBCon connection2;
        connection2 = DBCon.getInstance();
        connection2.query();

        DBConEnum connection3 = DBConEnum.INSTANCE;                     //singleton enum
        connection3.query();

        Train tomas;
        TransportFactory factory;                                       //Abstract factory + factory
        factory = new CargoTransportFactory();
        tomas = factory.createTrain();
        tomas.beep();
    }
    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    private static int factorialRecurs(int n){
        int result = 1;
        if (n>1)
            result *= n * factorialRecurs(n-1);
        return result;
    }
    private static int fibonacci(int n){
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        for (int i = 0; i < n-2; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n2;
    }
    private static int [] reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
    private static String[] splitString(String str, String delim){
        return str.split(delim);
    }

}
