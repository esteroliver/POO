import java.util.Scanner;
import java.util.ArrayList;

class Programa{
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        int n = 0;
        ArrayList<Pais> paises = new ArrayList<Pais>();
        String[] nomes = new String[10];
        int[] populacoes = new int[10];
        while (n < 10){
            nomes[n] = inp.nextLine();
            populacoes[n] = inp.nextInt();
            Pais x = new Pais(nomes[n], populacoes[n]);
            paises.add(x);
            n++;
        }
        System.out.println(Pais.maiorPopulacao(paises));
    }
}

class Pais{
    private String nome;
    private int populacao;
    //CONSTRUTOR
    public Pais(String nome, int populacao){
        setNome(nome);
        setPopulacao(populacao);
    }
    //MÉTODOS DE ALTERAÇÃO E ACESSO
    public void setNome(String nome){
        if (nome != "") this.nome = nome;
        else throw new IllegalArgumentException();
    }
    public void setPopulacao(int populacao){
        if (populacao >= 0) this.populacao = populacao;
        else throw new IllegalArgumentException();
    }
    public String getNome(){
        return nome;
    }
    public int getPopulacao(){
        return populacao;
    }
    //TO STRING
    public String toString(){
        return "Nome: " + nome + "\n" + "População: " + populacao;
    }
    //MAIOR POPULAÇÃO
    public static int maiorPopulacao(ArrayList<Pais> paises){
        int tamanho = paises.size();
        int maior = 0;
        for (int i = 0; i < tamanho; i++){
            if (paises.get(i).populacao > maior){
                maior = paises.get(i).populacao;
            }
        }
        return maior;
    }
}