import java.time.LocalDate;

class main {
    public static void main(String[] args){
        Aluno a = new Aluno("Ester", LocalDate.parse("2004-09-17"));
        Professor p = new Professor("Liandra", "Sociologia", LocalDate.parse("1992-09-10"));
        IPessoa[] v = {a, p};
        Relatorio.Aniversariantes(v, 9);
    }
}

interface IPessoa{
    String getNome();
    LocalDate getNascimento();
}

class Aluno implements Comparable, IPessoa{
    private String nome;
    private LocalDate data_nasc;
    private int aux;

    public Aluno(String nome, LocalDate data_nasc){
        this.nome = nome;
        this.data_nasc = data_nasc;
    }

    public String getNome(){
        return nome;
    }
    public LocalDate getNascimento(){
        return data_nasc;
    }
    @Override
    public int compareTo(Object obj){
        Aluno al = (Aluno) obj;
        if (this.nome.compareTo(al.getNome()) == 0) aux = 0;
        if (this.nome.compareTo(al.getNome()) < 0) aux = -1;
        if (this.nome.compareTo(al.getNome()) > 0) aux = 1;
        return aux;
    }
}

class Professor implements IPessoa{
    private String nome;
    private String grad;
    private LocalDate data_nasc;

    public Professor(String nome, String grad, LocalDate data_nasc){
        this.nome = nome;
        this.grad = grad;
        this.data_nasc = data_nasc;
    }

    public String getNome(){
        return nome;
    }
    public LocalDate getNascimento(){
        return data_nasc;
    }
}

class Relatorio{
    public static void Aniversariantes(IPessoa[] v, int mes){
        for (IPessoa p : v) {
            if (p.getNascimento().getMonthValue() == mes){
                System.out.println(p.getNome() + " " + p.getNascimento());
            }
        }
    }
}