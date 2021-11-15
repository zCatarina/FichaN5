import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("\n Insert Timezone and city(Format: Timezone/City):\n");
        String a = br.readLine();

        System.out.println(WorldTime.getTimeByCountry(a));


    }
}
