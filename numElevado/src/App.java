import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            double num, elevado, resultado;

            System.out.println("Ingrese el número que quiera elevar");
            num = leer.nextInt();
            System.out.println("Ingrese la potencia");
            elevado = leer.nextInt();

            resultado = Math.pow(num, elevado);
            System.out.println("El resultado es: " + resultado);
        }
    }
}
