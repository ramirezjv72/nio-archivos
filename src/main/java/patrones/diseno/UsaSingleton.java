package patrones.diseno;

public class UsaSingleton {
    public static void main(String[] args) {
        Monitor instancia1 = Monitor.getInstance();
        Monitor instancia2 = Monitor.getInstance();
        Monitor instancia3 = Monitor.getInstance();
    }
}

class Monitor {

    private static Monitor _instance;

    public static Monitor getInstance(){
        if (_instance ==null) {
            _instance = new Monitor();
            return _instance;
        } else {
            return _instance;
        }
    }
}


