class Programa_estacao {
    public static void main(String args[]){
        Estacao x = Estacao.Outono;
        Estacao y = Estacao.Verao;
        System.out.println(x);
        System.out.println(y);
    }
}

public enum Estacao{
    Primavera(1), Verao(2), Outono(3), Inverno(4);
    public final int flag;
    Estacao(int id){
        flag = id;
    }

    public int intId(){
        return flag;
    }
}


