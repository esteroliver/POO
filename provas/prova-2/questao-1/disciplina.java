class Main{
    public static void main(String args[]){

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