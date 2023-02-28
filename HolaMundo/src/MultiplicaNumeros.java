import java.util.Scanner;

public class MultiplicaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int signo = 1;
        if (num1 < 0) {
            num1 = -num1;
            signo = -1;
        }

        if (num2 < 0) {
            num2 = -num2;
            signo *= -1;
        }

        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        resultado *= signo;

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
