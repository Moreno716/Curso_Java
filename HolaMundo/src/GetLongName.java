import javax.swing.*;

public class GetLongName {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese nombre y apellido");
        String nombre2 = JOptionPane.showInputDialog("Ingrese otro nombre y apellido");
        String nombre3 = JOptionPane.showInputDialog("Ingrese un ultimo nombre y apellido");

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }
}