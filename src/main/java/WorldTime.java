import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

public class WorldTime {


    /**
     * Metodo que dada uma string com o local e o cidade
     * permite retornar uma string com as data as horas minutos e segundos
     * do local pretendido
     * @param s string com a info do local do qual queremos a hora
     * @return String com a data e hora
     */
    public static String getTimeByCountry (String s){

        LocalDateTime localDateTime = new LocalDateTime();
        String r = "user's localDateTime : ";
        r += localDateTime.toDateTime(DateTimeZone.forID(s));


        return r;
    }
}
