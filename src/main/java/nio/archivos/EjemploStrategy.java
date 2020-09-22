package nio.archivos;

public class EjemploStrategy {
    public static void main(String[] args) {
        String moneda = "dolar";
        CambioMoneda cambioMoneda;
        if ("mx".equals(moneda)){
            cambioMoneda = new CambioMonedaMx();
        } else if ("dolar".equals(moneda)){
            cambioMoneda = new CambioMonedaDolar();
        }

    }
}

interface CambioMoneda {
    int moneda();
}

class CambioMonedaMx implements CambioMoneda {

    @Override
    public int moneda() {
        return 21;
    }
}

class CambioMonedaDolar implements CambioMoneda{

    @Override
    public int moneda() {
        return 20;
    }
}