import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String args[]){
        LocalDate y = LocalDate.now();
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = y.format(formatacao);
        System.out.println(data);
    }
}
