import java.lang.reflect.Array;

class main{
    public static void main(String args[]){
        Colecao<Compromisso> agenda = new Colecao(Compromisso.class, 50);
        Colecao<Produto> loja = new Colecao(Produto.class, 10);
    }
}

class Compromisso{
    private int hora;
    private String descricao;
    public Compromisso(int hora, String descricao){
        this.hora = hora;
        this.descricao = descricao;
    }
    public int getHora(){
        return hora;
    }
    public String getDescricao(){
        return descricao;
    }
}

class Produto{
    private int preco;
    private String nome;
    public Produto(int preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }
    public int getPreco(){
        return preco;
    }
    public String getNome(){
        return nome;
    }
}

class Colecao<T> {
    private T[] objs;
    private int k = 0;
    public Colecao(Class<T> classe, int cap){
        objs = (T[]) Array.newInstance(classe, cap);
    }
    public void Inserir(T c){
        if (k < 50) objs[k++] = c;
    }
    public T popBack(){
        if (k > 0) return objs[--k];
        return null;
    }
    public int tamanho(){
        return k;
    }
}