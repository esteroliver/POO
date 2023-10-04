import java.util.Scanner;

class Programa{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        int valor1 = inp.nextInt();
        String naipe1 = inp.next();
        Carta c1 = new Carta(valor1, naipe1);

        int valor2 = inp.nextInt();
        String naipe2 = inp.next();
        Carta c2 = new Carta(valor2, naipe2);

        System.out.println(c1.cartasIguais(c2));
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
        if (naipe.equals("ouro") || naipe.equals("copas") || naipe.equals("espada") || naipe.equals("paus")) this.naipe = naipe;
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
    //CARTAS IGUAIS
    public String cartasIguais(Carta comp_carta){
        boolean iguais = false;
        if (valor == comp_carta.valor && naipe.equals(comp_carta.naipe)){
            iguais = true;
        }
        if (iguais) return "As cartas são iguais";
        else return "As cartas são diferentes";
    }
}
