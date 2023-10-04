import static java.lang.System.out;

class Programa{
    public static void main (String args[]){
        Cinema x;
        x = new Cinema();
        x.setDia("quarta");
        x.setHorario(18);
        x.Preco();
        x.outPreco();
    }
}

class Cinema{
    private int horario;
    private String dia;
    private double preco = 0;

    public void setDia(String dia){
            this.dia = dia;
    }
    public void setHorario(int horario){
        if (horario <= 24 && horario >= 0){
            this.horario = horario;
        }
        else{
            //retornar erro
        }
    }

    public void Acrescimo(int horario){
        if (horario >= 17){
            this.preco = preco + preco/2;
        }
    }
    
    public void Preco(){
        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quinta")){
            this.preco = 16;
            this.Acrescimo(horario);
        }
        if (dia.equals("quarta")){
            this.preco = 8;
            this.Acrescimo(horario);
        }
        if (dia.equals("sexta") || dia.equals("sábado") || dia.equals("domingo")){
            preco = 20;
            this.Acrescimo(horario);
        }
    }
    
    public void outPreco(){
        out.println(this.preco);
    }
}