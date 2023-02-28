import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // calendario.set(2020, Calendar.JULY, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.MAY);
        calendario.set(Calendar.DAY_OF_MONTH, 4);

        //calendario.set(Calendar.HOUR_OF_DAY, 15);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 57);
        calendario.set(Calendar.SECOND, 12);
        calendario.set(Calendar.MILLISECOND, 124);

        Date fecha = calendario.getTime();
        System.out.println("Calendario = " + fecha);
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("'FECHA:' yyyy/MM/dd - 'HORA:' hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if (fecha.after(fecha2)){
            System.out.println("Fecha del usuario es despues o mayor que fecha2");
        }else if(fecha.before(fecha2)){
            System.out.println("Fecha es anterior fecha2");
        } else if (fecha.equals(fecha2)) {
            System.out.println("fecha es igual a fecha2");
        }

        if(fecha.compareTo(fecha) > 0){
            System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
        }else if(fecha.compareTo(fecha2) < 0){
            System.out.println("fecha es anterior que fecha2");
        }else if(fecha.compareTo(fecha2) == 0){
            System.out.println("fecha es igual a fecha2");
        }
    }
}
