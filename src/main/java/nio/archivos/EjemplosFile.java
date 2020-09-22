package nio.archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjemplosFile {
    public static void main(String[] args) {
        /*File registrosIngresos =
                new File("/home/ricardo/IdeaProjects/nio-archivos/registros_ingresos.txt");
        System.out.println(registrosIngresos.exists());

        File folder = new File("/home/ricardo/IdeaProjects/nio-archivos/");
        File archivo = new File(folder, "ingresos2.txt");

        System.out.println(archivo.exists());

        try {
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(archivo.exists());
        System.out.println(folder.isDirectory());
        System.out.println(archivo.isFile());

        System.out.println(System.getProperty("file.separator"));

        try(FileInputStream fis = new FileInputStream("/home/ricardo/IdeaProjects/nio-archivos/registros_ingresos.txt")){
            int read = fis.read();
            while (read != -1){
                System.out.print((char) read);
                read = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileOutputStream fos
                    = new FileOutputStream(
                            "/home/ricardo/IdeaProjects/nio-archivos/ingresos_fos.txt")){
            String cadena = "Ingreso 9: 900\n" +
                            "Ingreso 10: 1000";
            fos.write(cadena.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        List<String> contenido = new ArrayList<>();
        try(BufferedReader br =
                new BufferedReader(
                        new FileReader(
                                "/home/ricardo/IdeaProjects/nio-archivos/ingresos_fos.txt"))){
            String s;
            while( (s= br.readLine()) != null) {
                contenido.add(s);
            }
            contenido.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter br =
                    new BufferedWriter(
                            new FileWriter(
                                    "/home/ricardo/IdeaProjects/nio-archivos/ingresos_fos2.txt", true))){
            //br.write("Ingreso 11: 1100");
            br.newLine();
            br.append( "Ingreso 13: 1300 ");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try(FileInputStream fis =
                    new FileInputStream(
                            "/home/ricardo/IdeaProjects/nio-archivos/ingresos_fos2.txt");
            FileOutputStream fos =
                    new FileOutputStream(
                            "/home/ricardo/IdeaProjects/nio-archivos/ingresos_fos3.txt")
        ){
          int b;
          while( (b=fis.read()) != -1 ){
              fos.write(b);
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
