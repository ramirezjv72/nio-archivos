package hilos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploHilos {
    private static int contador = 1;
    public static void main(String[] args) throws InterruptedException {

        Thread fecha =
                new Thread(
                        ()-> System.out.println(LocalDate.now()), "hiloDeFecha");
        System.out.println(fecha.getName());
        fecha.start();
        //fecha.join();
        System.out.println(Thread.currentThread().getName());

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()-> System.out.println(LocalDateTime.now()));
        service.shutdown();


        ScheduledExecutorService scheduled =
                Executors.newSingleThreadScheduledExecutor();

        scheduled
                .scheduleAtFixedRate(
                        ()->System.out.println("contador :" + (contador++)),
                        5, 1, TimeUnit.SECONDS);
    }
}