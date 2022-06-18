import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // declaracion scanner
        try (Scanner francesco = new Scanner(System.in)) {
            //declaracion types
            String user, contra;
            boolean contador = true; 
            // solicitud a usuario
            System.out.println("login");
            System.out.println("ingrese un nombre de usuario");
            String nombreUser = francesco.nextLine();
            System.out.println("ingrese una una contraseña en letras");
            String contraseña = francesco.nextLine();
            //condicion repetitiva do while
            do {
            System.out.println("ingrese su nombre de usuario");
            user = francesco.nextLine();
            System.out.println("ingrese su contraseña");
            contra = francesco.nextLine();
            if (nombreUser.equals(user) && contraseña.equals(contra)) {
                contador = false; 
            }
            } while (contador == true);

            System.out.println("ingreso correcto");
        }
    }
}