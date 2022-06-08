//Práctica 4, ejercicio 4, ejemplo con arrays: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String[] user = new String[100];
            String[] pass = new String[100];

            System.out.println("Cree un usuario");
            user[1] = leer.nextLine();
            System.out.println("Cree una contraseña");
            pass[1] = leer.nextLine();

            System.out.println(user[1]);
            System.out.println(pass[1]);
        }


    }
}
