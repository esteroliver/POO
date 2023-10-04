class Programa{
    public static void main (String args[]){
        Pais x, y;
        x = new Pais("Vaticano", 990);
        y = new Pais("Nauru", 9771);
        System.out.println(x.toString());
        System.out.println(y.toString());
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

}