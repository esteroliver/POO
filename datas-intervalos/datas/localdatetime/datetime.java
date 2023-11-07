import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String args[]){
        LocalDateTime x = LocalDateTime.now();
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String data = x.format(formatacao);
        System.out.println(data);
    }
}
