import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

       //calendario.set(2023,Calendar.FEBRUARY,7, 24,37,20);
        calendario.set(Calendar.YEAR,2023);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH,7);

        //calendario.set(Calendar.HOUR_OF_DAY, 11);
        calendario.set(Calendar.HOUR, 11);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE,43);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato= " + fecha);

        System.out.println("calendario = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();
        if (fecha.after(fecha2)){
            System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
        } else if (fecha.before(fecha2)){
            System.out.println("fecha es anterior que fechas");
        } else if (fecha.equals(fecha2)) {
            System.out.println("fecha1 es igual a fecha2");
        }

        if (fecha.compareTo(fecha2) > 0){
            System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
        } else if (fecha.compareTo(fecha2) < 0) {
            System.out.println("fecha es anterior que fechas");
        } else if (fecha.compareTo(fecha2) == 0) {
            System.out.println("fecha1 es igual a fecha2");
        }
    }
}
