import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ExportarEmpleados {
    @SuppressWarnings("static-access")
    public void exportarEmpleados(LinkedList<Empleado> lista)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("Empleados.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (Empleado empleado : lista) {
                exportar.write("Nombre" + " : " + empleado.getNombre() + "\n");
                exportar.write("Apellido" + " : " + empleado.getApellido()+ "\n");
                exportar.write("Direccion" + " : " + empleado.getDireccion()+"\n");
                exportar.write("edad" + " : " + empleado.getEdad()+ "\n");
                exportar.write("Cargo" +" : " + empleado.getCargo()+"\n");
                exportar.write("\n\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}
