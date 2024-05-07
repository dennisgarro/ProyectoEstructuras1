import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      LinkedList<Empleado> empleado = new LinkedList<>();
        LinkedList<Empleado> Lista = new LinkedList<>();
        ExportarEmpleados ex = new ExportarEmpleados();
        ImportarEmpleados im = new ImportarEmpleados();
        mostrarEmpleado me = new mostrarEmpleado();
        // int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de empleados "));
        // for (int i = 0; i < cant; i++) {
        //     Empleado e = new Empleado(null, null, null, i, null);
        //     e.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
        //     e.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
        //     e.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
        //     e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        //     e.setCargo(JOptionPane.showInputDialog("Ingrese cargo"));
        //     empleado.add(e);
        // }
        // ex.exportarEmpleados(empleado);
        Lista = im.importarEmpleado("Empleados.txt");
        me.MostrarEmpleado(Lista);
       
        

    }
}