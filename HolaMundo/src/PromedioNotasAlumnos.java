import java.util.Scanner;

public class PromedioNotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;

        int notas1 = 0, notasMas5 = 0, notasMenos4 = 0;
        double sumaMas5 = 0, sumasMenos4 = 0, total = 0;

        double promedioMas5, promedioMenos4;
        boolean error = false;

        for(int i = 0; i < 20; i++){
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota=scanner.nextDouble();

            if(nota == 0){
                error = true;
                break;
            }

            if(nota == 1){
                notas1++;
            } else{
                if(nota > 5){
                    notasMas5++;
                    sumaMas5 += nota;
                } else if(nota < 4){
                    notasMenos4++;
                    sumasMenos4 += nota;
                }
            }
            total += nota;
        }
        if(error){
            System.out.println("Error: No puede haber notas con valor 0");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El numero de notas 1 es de: "+ notas1);
        //trabajamos con las notas superiores a 5
        if (notasMas5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioMas5 = sumaMas5 / notasMas5;
            System.out.println("Promedio de notas mayores a 5: " + promedioMas5);
        }
        // trabajamos con las notas inferiores a 4
        if (notasMas5 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioMenos4 = sumasMenos4 / notasMenos4;
            System.out.println("Promedio de notas menores a 3: " + promedioMenos4);
        }

        // promedio total de las notas
        double promedioTotalNotas = total / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
