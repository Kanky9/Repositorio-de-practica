import java.util.Scanner; 

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int[] miArray = { 0, 0 };
            int  num1,  num2;
            do{
                System.out.println("Ingrese dos números entre el 7 y 57");
                System.out.println("Primer número: ");
                num1 = leer.nextInt();
                System.out.println("Segundo número: ");
                num2 = leer.nextInt();

                if ( num1 >= 7 &&  num1 <= 57) {
                    miArray[1] = num1;
                    if (num2 >= 7 && num2 <= 57) {
                        miArray[0] = num2;
                    }
                    else {
                        System.out.println("El número no cumple con los parámetros");
                    }
                }
                else {
                    System.out.println("El número no cumple con los parámetros");
                }
            } while ( num1 != num2 || num1 < 7 || num1 > 57 || num2 < 7 || num2 > 57);
            System.out.println("El número " + miArray[1] + " y " + miArray[0] + " son iguales");
        }
    }
}