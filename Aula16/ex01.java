import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import javax.swing.text.DateFormatter;

class Programa {
    public static void main(String args[]){
        IPessoa a1 = new Aluno("Ester", "TADS", LocalDateTime.parse("2004-09-17T00:00:00"));
        IPessoa p1 = new Professor("Eduardo", "Diatinf", LocalDateTime.parse("1971-01-01T00:00:00"));
        
        System.out.println(a1.getNome());
        System.out.println(a1.getNascimento());
        System.out.println(p1.getNome());
        System.out.println(p1.getNascimento());

        Aluno a2 = new Aluno("Débora", "TADS", LocalDateTime.parse("2001-11-21T00:00:00"));
        Professor p2 = new Professor("Jorgiano", "Diatinf", LocalDateTime.parse("1970-11-20T00:00:00"));

        System.out.println(a2.getNome());
        System.out.println(a2.getCurso());
        System.out.println(a2.getNascimento());
        System.out.println(p2.getNome());
        System.out.println(p2.getDiretoria());
        System.out.println(p2.getNascimento());

        IPessoa[] v = {a1, a2, p1, p2};
        mesAniversariantes(v, 11);

        IPessoa[] participantes = {a1, a2, p1, p2};
        mostrarParticipantes(participantes);


    }

    public static void mesAniversariantes(IPessoa[] pessoas, int mes){
        for (IPessoa p : pessoas) {
            if(p.getNascimento().getMonthValue() == mes){
                System.out.print(p.getNome());
                System.out.println();
            }
        }
    }
    public static void mostrarParticipantes(IPessoa[] pessoas){
        IPessoa[] aux = new IPessoa[4];
        System.arraycopy(pessoas, 0, aux, 0, 4);
        Arrays.sort(aux);
        for (IPessoa p : aux){
            System.out.print(p.getNome());
            System.out.println();
        }
    }
}

interface IPessoa extends Comparable{
    String getNome();
    LocalDateTime getNascimento();
    
}

class Aluno implements IPessoa{
    private String nome;
    private LocalDateTime datanasc;
    private String curso;
    private int aux;

    public String getNome() { return nome;}
    public LocalDateTime getNascimento() { return datanasc; }
    public String getCurso() { return curso; }
    public int compareTo(Object ob){
        IPessoa x = (IPessoa) ob;
        if(this.nome.compareTo(x.getNome()) > 0) aux = 1;
        if(this.nome.compareTo(x.getNome()) < 0) aux = -1;
        if(this.nome.compareTo(x.getNome()) == 0) aux = 0;
        return aux;
    }

    public Aluno(String nome, String curso, LocalDateTime datanasc){
        this.nome = nome;
        this.curso = curso;
        this.datanasc = datanasc;
    }
    public String toString(){
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data_str = datanasc.format(formatacao);
        return nome + " " + curso + " " + data_str;
    }
}

class Professor implements IPessoa{
    private String nome;
    private LocalDateTime datanasc;
    private String diretoria;
    private int aux;

    public String getNome() { return nome;}
    public LocalDateTime getNascimento() { return datanasc; }
    public String getDiretoria() { return diretoria; }
    public int compareTo(Object ob){
        IPessoa x = (IPessoa) ob;
        if(this.nome.compareTo(x.getNome()) > 0) aux = 1;
        if(this.nome.compareTo(x.getNome()) < 0) aux = -1;
        if(this.nome.compareTo(x.getNome()) == 0) aux = 0;
        return aux;
    }

    public Professor(String nome, String diretoria, LocalDateTime datanasc){
        this.nome = nome;
        this.diretoria = diretoria;
        this.datanasc = datanasc;
    }
    public String toString(){
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data_str = datanasc.format(formatacao);
        return nome + " " + diretoria + " " + data_str ;
    }
}
