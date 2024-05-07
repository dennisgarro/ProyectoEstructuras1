import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrarEmpleado {
    public void MostrarEmpleado(LinkedList<Empleado> lista) {
        StringBuilder mensaje = new StringBuilder();
        for (Empleado empleado : lista) {
            mensaje.append("Nombre").append(empleado.getNombre()).append("\n");
            mensaje.append("Apellido").append(empleado.getApellido()).append("\n");
            mensaje.append("Direccion").append(empleado.getDireccion()).append("\n");
            mensaje.append("Edad").append(empleado.getEdad()).append("\n");
            mensaje.append("Cargo").append(empleado.getCargo()).append("\n");
        }
        JOptionPane.showInputDialog(null, mensaje.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
    }

}
