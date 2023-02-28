import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Pedro", "Mario", "Sara", "Karen", "Jhon"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("Mario") || nombres[i].equalsIgnoreCase("Jhon")){
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
