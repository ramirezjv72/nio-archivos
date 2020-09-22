package nio.archivos;

import java.util.HashMap;
import java.util.Map;

public class EjemploFlightWeight {

    private static Map<String, Long> dias;

    static {
        dias = new HashMap<>();
        dias.put("L", 10L);
        dias.put("M", 20L);
        dias.put("W", 30L);
        dias.put("J", 40L);
        dias.put("V", 50L);
    }

    public static Long getDias(String cadena) {
        return dias.get(cadena);
    }

    public static void main(String[] args) {
        Long valor = EjemploFlightWeight.getDias("V");
        System.out.println(valor);
    }

}


