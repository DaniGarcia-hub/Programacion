import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int elecc;
        try {
            do {
                System.out.println("Escoge una opción:");
                System.out.println("1. Jugar.");
                System.out.println("2. Modo Historia.");
                System.out.println("3. Ajustes.");
                System.out.println("4. Salir.");

                    elecc = sc.nextInt();

                    switch (elecc) {
                        case 1:
                            System.out.println("Jugando...");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Cargando historia...");
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Entrando en ajustes...");
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }

            } while (elecc != 4);

        } catch (InputMismatchException e) {
            System.out.println("Solo se permiten números.");
        }
    }
}
