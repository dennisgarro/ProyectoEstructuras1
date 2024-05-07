import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarEmpleados {
    public LinkedList<Empleado> importarEmpleado(String Archivo) {
        LinkedList<Empleado> lista = new LinkedList<>();
        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea= "";
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1];
                switch (Atributo) {
                    case "nombre":
                        String nombre = valor.trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String direccion = importar.readLine().split(":")[1].trim();
                        int edad = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        String cargo = importar.readLine().split(":")[1].trim();
                        Empleado empleado = new Empleado(nombre, apellido, direccion, edad, cargo);
                        lista.add(empleado);
                        // Leer la línea en blanco entre empleados
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
