package nio2.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class EjemplosNioDos {
    public static void main(String[] args) {
        Path equiposComputo =
                Paths.get(
                        "/home/ricardo/IdeaProjects/nio-archivos/archivos_nio_2/equipos_computo.txt");

        System.out.println(equiposComputo.subpath(1, 3));
        System.out.println(equiposComputo.getParent());
        File file = equiposComputo.toFile();
        System.out.println(file.isFile());

        boolean existe = Files.exists(equiposComputo);
        System.out.println(existe);
        try {
            Path nioDosPath = Paths.get("/home/ricardo/IdeaProjects/nio-archivos/nioDos");
            if (!Files.exists(nioDosPath)) {
                Path dirNioDos = Files.createDirectory(nioDosPath);
            } else {
                System.out.println("Directorio ya existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Path archivoRutas = Paths.get("/home/ricardo/IdeaProjects/nio-archivos/nioDos/rutas.txt");
            if (!Files.exists(archivoRutas)) {
                Path rutas = Files.createFile(archivoRutas);
                System.out.println("Rutas existe? " + Files.exists(rutas));
            } else {
                System.out.println("El archivo ya existe");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Path destino =
                  Paths.get("/home/ricardo/IdeaProjects/nio-archivos/nioDos/rutas_2.txt");
            Files.delete(destino);
            if (!Files.exists(destino)) {
                Path rutasCopy = Files.copy(
                    Paths.get("/home/ricardo/IdeaProjects/nio-archivos/nioDos/rutas.txt"),
                    destino);
                System.out.println("Creo el archivo: " + destino.getFileName());
            } else {
                System.out.println("El archivo copiado ya existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Path rutasDos = Paths.get(
                    "/home/ricardo/IdeaProjects/nio-archivos/nioDos/rutas_2.txt");
            List<String> contenido =
            Files.readAllLines(rutasDos);
            BasicFileAttributes attributes =
                    Files.readAttributes(rutasDos, BasicFileAttributes.class);
            contenido.forEach(System.out::println);
            System.out.println(attributes.creationTime());
            System.out.println(attributes.size());
            System.out.println(attributes.lastModifiedTime());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
