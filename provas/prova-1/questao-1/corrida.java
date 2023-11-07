import java.util.Scanner;
import java.util.ArrayList;

class Programa {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = 0;
        ArrayList<Double> corridas = new ArrayList<Double>();
        String[] datas = new String[10];
        String[] horarios = new String[10];
        String[] duracoes = new String[10];
        int[] distancias = new int[10];
        while (n < 10){
            datas[n] = inp.next();
            horarios[n] = inp.next();
            duracoes[n] = inp.next();
            distancias[n] = inp.nextInt();
            Corrida x = new Corrida(datas[n], horarios[n], duracoes[n], distancias[n]);
            corridas.add(x.velocidadeMedia());
            n++;
        }
        double max = corridas.get(0);
        for (int i = 1; i < n; i++){
            if (corridas.get(i) > max){
                max = corridas.get(i);
            }
        }
        System.out.println(max);
    }
}

class Corrida {
    private String data, hora_inicio, duracao;
    private double distancia;
    //CONSTRUTOR
    public Corrida(String data, String hora_inicio, String duracao, double distancia){
        setData(data);
        setHoraInicio(hora_inicio);
        setDuracao(duracao);
        setDistancia(distancia);
    }
    //SET/GET
    public void setData(String data){
        this.data = data;
    }
    public void setHoraInicio(String hora_inicio){
        //VERIFICAÇÃO
        String[] hora_int =  hora_inicio.split(":");
        char[] hora_string = new char[5]; 
        boolean valido1 = false;
        for (int i = 0; i < 5; i++){
            hora_string[i] = hora_inicio.charAt(i);
        }
        if (hora_string[2] == ':' && Integer.parseInt(hora_int[0]) >= 0 && Integer.parseInt(hora_int[0]) <= 24 && Integer.parseInt(hora_int[1]) >= 0 && Integer.parseInt(hora_int[1]) <= 59 ) valido1 = true;
        //SETANDO VALORES
        if (valido1) this.hora_inicio = hora_inicio;
        else throw new IllegalArgumentException();
    }
    public void setDuracao(String duracao){
        //VERIFICAÇÃO
        String[] duracao_int = duracao.split(":");
        char[] duracao_string = new char[8];
        boolean valido2 = false;
        for (int j = 0; j < 8; j++){
            duracao_string[j] = duracao.charAt(j);
        }
        if (duracao_string[2] == ':' && duracao_string[5] == ':' && Integer.parseInt(duracao_int[0]) >= 0 && Integer.parseInt(duracao_int[0]) <= 24 && Integer.parseInt(duracao_int[1])
        >= 0 && Integer.parseInt(duracao_int[1]) <= 59 && Integer.parseInt(duracao_int[2])
        >= 0 && Integer.parseInt(duracao_int[2]) <= 59){
            valido2 = true;
        }
        //SETANDO VALORES
        if (valido2) this.duracao = duracao;
        else throw new IllegalArgumentException();
    }
    public void setDistancia(double distancia){
        if (distancia > 0) this.distancia = distancia;
        else throw new IllegalArgumentException();
    }
    public String getData(){
        return data;
    }
    public String getHoraInicio(){
        return hora_inicio;
    }
    public String getDuracao(){
        return duracao;
    }
    public double getDistancia(){
        return distancia;
    }
    //VELOCIDADE MÉDIA (distancia/duracao)
    public double velocidadeMedia(){
        String[] tempo = duracao.split(":");
        double km = distancia/1000;
        double hora = Double.valueOf(tempo[0]).doubleValue() + (Double.valueOf(tempo[1]).doubleValue())/60.0;
        double km_hora = km/hora;
        return km_hora;
    }
    //TO STRING
    public String toString(){
        return "Data: " + data + "\n" +
        "Hora de início: " + hora_inicio + "\n" +
        "Duração: " + duracao + "\n" +
        "Distância: " + distancia + "m" +  "\n";
    }
}
