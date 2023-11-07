import java.time.LocalDate;
import java.time.Period;

class Main{
    public static void main(String args[]){
        Period x;
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        x = Period.between(hoje, amanha);
        System.out.println(x.getDays());
    }
}