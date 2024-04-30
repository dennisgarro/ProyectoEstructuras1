import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        LinkedList<Empleado> listaEmpleados = new LinkedList<>();
        Mostrar m = new Mostrar();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Empleado empleado = new Empleado(null, null, null, 0, null);
            System.out.println("Ingrese el Nombre");
            empleado.setNombre(sc.next());
            System.out.println("Ingrese el Apellido");
            empleado.setApellido(sc.next());
            System.out.println("Ingrese la Direccion");
            empleado.setDireccion(sc.next());
            System.out.println("Ingrese la Edad");
            empleado.setEdad(sc.nextInt());
            System.out.println("DennIngrese el Cargo");
            empleado.setCargo(sc.next());
            listaEmpleados.add(empleado);

        }
       m.mostrar(listaEmpleados);
        

    }
}