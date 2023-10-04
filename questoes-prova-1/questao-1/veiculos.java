class Programa{
    public static void main(String args[]){
        Veiculos carro;
        carro = new Veiculos("UNO", 109, 1010);
        System.out.println(carro.toString());
    }
}

class Veiculos {
    private String nome;
    private int potencia;
    private double peso;
    public Veiculos(String nome, int potencia, double peso){
        SetNome(nome);
        SetPotencia(potencia);
        SetPeso(peso);
    }
    //FUNÇÕES PARA VISUALIZAR OS MEMBROS
    public String GetNome(){
        return nome;
    }
    public int GetPotencia(){
        return potencia;
    }
    public double GetPeso(){
        return peso;
    }
    //FUNÇÕES PARA DEFINIR OS MEMBROS
    public void SetNome(String nome){
        if (nome != "") this.nome = nome;
        else throw new IllegalArgumentException();
    }
    public void SetPotencia(int potencia){
        if (potencia > 0) this.potencia = potencia;
        else throw new IllegalArgumentException();
    }
    public void SetPeso(double peso){
        if (peso >= 0) this.peso = peso;
        else throw new IllegalArgumentException();
    }
    //RELAÇÃO PESO/VEÍCULO
    public double PesoPotencia(){
        return peso/potencia;
    }
    //REPASSAR OS DADOS DO VEÍCULO
    public String toString(){
        return "Nome: " + nome + "\n" +
        "Potência: " + potencia + "\n" +
        "Peso: " + peso + "\n" +
        "Relação peso/potência: " + PesoPotencia();
    }
}
