public class NumerosOrdenados {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;

        String calculo = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println("El orden es: " + calculo);
    }
}