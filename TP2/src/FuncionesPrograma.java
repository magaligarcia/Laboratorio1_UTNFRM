import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;
public class FuncionesPrograma {

    static String getFechaString(Date fecha){
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/mm/yyyy");
        String getFechaString = simpleFormat.format(fecha);

        return getFechaString;
    }

    public static Date getFechaDate(int dia, int mes, int anio){
        dia = 30;
        mes = 9;
        anio = 2021;
        LocalDate LDate = LocalDate.of(anio, mes, dia);
        Date getFechaDate = java.sql.Date.valueOf(LDate);
        return getFechaDate;
    }

}
