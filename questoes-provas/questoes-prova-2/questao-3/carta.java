class Programa{
    public static void main(String args[]){
        Carta c1 = new Carta(10, "copas");
        System.out.println(c1.toString());
        Carta c2 = new Carta(10, "copas");
        System.out.println(c2.toString());
    }
}

class Carta {
    private int valor;
    private String naipe;
    //CONSTRUTOR
    public Carta(int valor, String naipe){
        setValor(valor);
        setNaipe(naipe);
    }
    //SET E GET
    public void setValor(int valor){
        if (valor >= 1 && valor <= 13) this.valor = valor;
        else throw new IllegalArgumentException();
    }
    public void setNaipe(String naipe){
        if (naipe == "ouro" || naipe == "copas" || naipe == "espada" || naipe == "paus") this.naipe = naipe;
        else throw new IllegalArgumentException();
    }
    public int getValor(){
        return valor;
    }
    public String getNaipe(){
        return naipe;
    }
    //TO STRING
    public String toString(){
        return "Carta: " + valor + "\n" + "Naipe: " + naipe;
    }
}
