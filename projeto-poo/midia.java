import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Midia{
    private int id;
    private int tipo;
    private String descricao;
    private String titulo;
    private String autor_diretor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor_diretor() {
        return autor_diretor;
    }
    public void setAutor_diretor(String autor_diretor) {
        this.autor_diretor = autor_diretor;
    }

    public Midia(int id, int tipo, String descricao, String titulo, String autor_diretor){
        setId(id);
        setTipo(tipo);
        setDescricao(descricao);
        setTitulo(titulo);
        setAutor_diretor(autor_diretor);
    }

    public String toString(){
        return "Título: " + titulo + '\n' +
        "Sinopse: " + descricao + '\n' +
        "Autor/diretor: " + autor_diretor;
    }
}

class Filme extends Midia{
    private LocalDateTime duracao;
    public Filme(int id, int tipo, String descricao, String titulo, String autor_diretor, LocalDateTime duracao){
        super(id, tipo, descricao, titulo, autor_diretor);
        this.duracao = duracao;
    }
    public String toString(){
        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
        String duracao_filme = duracao.format(form);
        return super.toString() + '\n' +
        "Duração: " + duracao_filme + '\n';
    }
}

class Serie extends Midia{
    private int temporadas;
    public Serie(int id, int tipo, String descricao, String titulo, String autor_diretor, int temporadas){
        super(id, tipo, descricao, titulo, autor_diretor);
        if(temporadas >= 1)
            this.temporadas = temporadas;
    }
    public String toString(){
        return super.toString() + '\n' +
        "Temporadas: " + temporadas + '\n';
    }
}

class Livro extends Midia{
    private int paginas;
    public Livro(int id, int tipo, String descricao, String titulo, String autor_diretor, int paginas){
        super(id, tipo, descricao, titulo, autor_diretor);
        if(paginas >= 10)
            this.paginas = paginas;
    }
    public String toString(){
        return super.toString() + '\n' +
        "Número de páginas: " + paginas + '\n';
    }
}

class NMidia{
    private List<Midia> midias = new ArrayList<Midia>();
    private int n1;
    private String n2;
    private boolean n3;

    public void ToXML() throws IOException{
        FileOutputStream fos = new FileOutputStream("Midia.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
    }
    public void Inserir(Midia m){

    }
    public List<Midia> Listar(){

    }
    public Midia ObterID(int id){
        return ;
    }
    public void Atualizar(Midia mid){

    }
    public void Excluir(int id){

    }
}