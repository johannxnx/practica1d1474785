import java.awt.*;
import java.util.Scanner;
public class Main {

    public static String usuario = "cajero_202201405";

    public static String password = "ipc_202201405";

    public static String productos[][] = new String[5][2];

    public static Scanner valor_ingresado = new Scanner(System.in);

    public static void Ingreso_Productos() {
        String nombre = valor_ingresado.next();
        Double precio;

        try {
            precio = valor_ingresado.nextDouble();
        } catch (Exception e) {
            System.out.println("Valores mayores a 0");
            return;
        }

        for (int i = 0; i < productos.length; i++) {

            if (productos[0][i] != null && productos[0][i].equals(nombre)) {
                System.out.println("Ya existe");
                return;
            }
            productos[i][0] = nombre;
            productos[i][1] = precio.toString();
            System.out.println("Ingreso correctamente");
        }
        return;

    }

    public static void main(String[] args) {
        /*...*/
        System.out.println("Bienvenido ingresar usuario y contraseña");
        String usuario_ingresado, password_ingresado;
        int opcion_menu = 0;
        String producto_nuevo;
        Double precio_producto;

        do{
            System.out.println("Ingrese Usuario");
            usuario_ingresado = valor_ingresado.next();

            System.out.println("Ingrese password");
            password_ingresado = valor_ingresado.next();

            if (usuario_ingresado.equals(usuario) == true && password_ingresado.equals(password) == true){
                System.out.println("1. Agregar nuevos productos");
                System.out.println("2. Agregar cupones de descuento");
                System.out.println("3. Realizar ventas");
                System.out.println("4. Realizar reporte");
                System.out.println("5. Salir");
                opcion_menu = valor_ingresado.nextInt();

                switch (opcion_menu) {
                    case 1:
                        System.out.println("Ingrese nombre del producto");
                        producto_nuevo = valor_ingresado.next();

                        System.out.println("Ingrese nombre del producto");
                        precio_producto = valor_ingresado.nextDouble();

                        Ingreso_Productos();

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                    case 5:

                        break;
                }
            }
        } while (usuario_ingresado.equals(usuario) != true && password_ingresado.equals(password) != true);
    }
}