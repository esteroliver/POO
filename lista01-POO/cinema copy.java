import static java.lang.System.out;

class Programa{
    public static void main (String args[]){
        Cinema x;
        x = new Cinema();
        x.dia = "terça";
        x.horario = 18;
        out.println(x.Preco());
    }
}

class Cinema{
    public int horario;
    public String dia;
    public double preco = 0;

    public void Acrescimo(int horario, double preco){
        if (horario >= 17){
            this.preco = preco + preco/2;
        }
    }

    public void Preco(){
        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quinta")){
            preco = 16;
            this.Acrescimo(horario, preco);
        }
        if (dia.equals("quarta")){
            preco = 8;
            this.Acrescimo(horario, preco);
        }
        if (dia.equals("sexta") || dia.equals("sábado") || dia.equals("domingo")){
            preco = 20;
            this.Acrescimo(horario, preco);
        }
        return preco;
    }
}