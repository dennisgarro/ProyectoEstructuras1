import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Mostrar {
    public void mostrar(LinkedList<Empleado> listaempleado){
        String cadena = "";
         for (Empleado empleado : listaempleado) {
            cadena = cadena + empleado.getApellido() + "\n" + empleado.getNombre()  + "\n" + empleado.getDireccion()+ "\n"
            + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";    
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
