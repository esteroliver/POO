import static java.lang.System.out;

class Programa{
    public static void main (String args[]){
        Cinema x;
        x = new Cinema();
        x.setDia("terça");
        x.setHorario(18);
        x.outPreco();
    }
}

class Cinema{
    private int horario;
    private String dia;
    public void setDia(String dia){
            this.dia = dia;
    }
    public void setHorario(int horario){
        if (horario <= 24 && horario >= 0){
            this.horario = horario;
        }
    }
    private double preco;
    public void Preco(){
        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quinta")){
            preco = 16;
            this.Acrescimo(horario);
        }
        if (dia.equals("quarta")){
            preco = 8;
            this.Acrescimo(horario);
        }
        if (dia.equals("sexta") || dia.equals("sábado") || dia.equals("domingo")){
            preco = 20;
            this.Acrescimo(horario);
        }
    }
    public void Acrescimo(int horario){
        if (horario >= 17){
            preco = preco + preco/2;
        }
    }
    public void outPreco(){
        out.println(preco);
    }
}