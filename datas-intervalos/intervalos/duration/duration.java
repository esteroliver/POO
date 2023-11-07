import java.time.Duration;
import java.time.LocalDateTime;

class Main {
    public static void main(String args[]){
        Duration x;
        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime horas_depois = hoje.plusHours(5);
        horas_depois = horas_depois.plusMinutes(20);
        x = Duration.between(hoje, horas_depois);
        long seg = x.getSeconds();
        long min = seg/60;
        long horas = min/60;
        min = min%60;
        seg = seg%60;
        System.out.println(horas + ":" + min + ":" + seg);

    }
}
