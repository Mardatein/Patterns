public class DBCon {
    private static DBCon instance;

    private DBCon(){
    }

    public static DBCon getInstance() {
        if (instance==null)
            instance = new DBCon();
        return instance;
    }
    public  void query(){

    }
    //методы для работы с бд
}
