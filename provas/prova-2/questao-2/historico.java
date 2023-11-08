import java.util.Arrays;

class Main{
    public static void main(String args[]){

    }
}

class Historico{
    private String aluno;
    private Disciplina[] disciplinas = new Disciplina[10];
    private int k = 0;

    public Historico(String aluno){
        if (aluno != "") this.aluno = aluno;
    }

    public String getAluno(){
        return aluno;
    }

    public void Inserir(Disciplina d){
        disciplinas[k] = d;
        k++;
    }
    public Disciplina[] Listar(){
        Disciplina[] aux = new Disciplina[k];
        System.arraycopy(disciplinas, 0, aux, 0, k);
        Arrays.sort(aux);
        return aux;
    }
    public Disciplina[] ListarSemestre(String sem){
        int n = 0;
        for (Disciplina d : Listar()) {
            if(d.getSemestre().equals(sem)) n++;
        }
        Disciplina[] dis_semestre = new Disciplina[n];
        int m = 0;
        for (Disciplina dis : Listar()) {
            if(dis.getSemestre().equals(sem)){
                dis_semestre[m] = dis;
                m++;
            }
        }
        Arrays.sort(dis_semestre);
        return dis_semestre;
    }
    public Disciplina[] maiorMedia(){
        int maior = 0;
        int quant = 0;
        for (Disciplina d : Listar()) {
            if (d.getMedia() > maior){
                maior = d.getMedia();
            }
        }
        for (Disciplina d : Listar()) {
            if (d.getMedia() == maior){
                quant++;
            }
        }
        Disciplina[] maiores_notas = new Disciplina[quant];
        int n = 0;
        for (Disciplina d : Listar()) {
            if (d.getMedia() == maior)
                maiores_notas[n++] = d;
        }
        Arrays.sort(maiores_notas);
        return maiores_notas;
    }
    public int IRA(){
        int ira = 0;
        for (int i = 0; i < k; i++){
            ira += disciplinas[i].getMedia();
        }
        ira = ira/k;
        return ira;
    }
    public int totalCh(){
        int carga_total = 0;
        for (int i = 0; i < k; i++){
            carga_total += disciplinas[i].getCarga();
        }
        return carga_total;

    }
    public String toString(){
        return "ALUNO: " + aluno + "\n" +
        "NÚMERO DE DISCIPLINAS: " + k;
    }
}

class Disciplina implements Comparable{
    private String nome, semestre;
    private int media, ch, aux;
    private boolean aprovado;
    public Disciplina(String nome, String semestre, int media, int ch, boolean aprovado){
        setNome(nome);
        setSemestre(semestre);
        setMedia(media);
        setCarga(ch);
        setSituacao(aprovado);
    }

    //MÉTODOS SET
    public void setNome(String nome){
        if(nome != "") this.nome = nome;
    }
    public void setSemestre(String semestre){
        String[] semestre_str = semestre.split("\\.");
        int periodo = Integer.parseInt(semestre_str[1]);
        int ano = Integer.parseInt(semestre_str[0]);
        if(semestre.length() == 6 && semestre.charAt(4) == '.' && periodo <= 2 && periodo >=1 && ano >= 2000 && ano <= 2023) this.semestre = semestre;
    }
    public void setMedia(int media){
        if(media >= 0 && media <= 100) this.media = media;
    }
    public void setCarga(int ch){
        if(ch > 0) this.ch = ch;
    }
    public void setSituacao(boolean aprovado){
        this.aprovado = aprovado;
    }
    //MÉTODOS GET
    public String getNome(){
        return nome;
    }
    public String getSemestre(){
        return semestre;
    }
    public int getMedia(){
        return media;
    }
    public int getCarga(){
        return ch;
    }
    public boolean getSituacao(){
        return aprovado;
    }
    public String toString(){
        
        String situacao;
        if (aprovado) situacao = "Aprovado";
        else situacao = "Reprovado";

        return "DISCIPLINA: " + nome + "\n" +
        "SEMESTRE: " + semestre + "\n" + 
        "MÉDIA: " + media + "\n" +
        "CARGA HORÁRIA: " + ch + "\n" +
        "SITUAÇÃO DO ALUNO: " + situacao;
    }

    @Override
    public int compareTo(Object ob){
        Disciplina x = (Disciplina) ob;
        if (this.nome.compareTo(x.getNome()) == 0) aux = 0;
        if (this.nome.compareTo(x.getNome()) > 0) aux = 1;
        if (this.nome.compareTo(x.getNome()) < 0) aux = -1;
    
        return aux;
    }
}