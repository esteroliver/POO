import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;


class Programa{
    public static void main(String args[]){
        LocalDateTime x = LocalDateTime.now();
        System.out.println("Antes de formatar: " + x);
        DateTimeFormatter formatacao_data_atual = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatacao_str_data_atual = x.format(formatacao_data_atual);
        System.out.println("Após a formatação: " + formatacao_str_data_atual);

        try (Scanner inp = new Scanner(System.in)) {
            //INPUT DE DATA
            String dia = inp.next();
            String mes = inp.next();
            String ano = inp.next();
            //DATA FORMATADA
            LocalDateTime y = LocalDateTime.parse(ano+"-"+mes+"-"+dia+"T00:00:00");
            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formatacao_str = y.format(formatacao);
            System.out.println(formatacao_str);

            //DIA DA SEMANA
            String dia_semana = dia+"/"+mes+"/"+ano;
            DateTimeFormatter formatacao_dia_semana = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DayOfWeek dia_sem = DayOfWeek.from(formatacao_dia_semana.parse(dia_semana));
            System.out.println(dia_sem.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")).toUpperCase());
        }

        //INTERVALO DE TEMPO
        LocalDate data_nasc = LocalDate.of(2004, Month.SEPTEMBER, 17);
        LocalDate hoje = LocalDate.now();

        Period tempo = Period.between(data_nasc, hoje);
        long dias_total = ChronoUnit.DAYS.between(data_nasc, hoje);
        System.out.println("Você tem " + tempo.getYears() + " anos, " + tempo.getMonths() + " meses e " + tempo.getDays() + " dias de idade. (" + dias_total + " dias ao total)");

    }
}
