import java.time.LocalDateTime;
import java.util.Arrays;

public class ex01{
    public static void main(String args[]){
        ContaReceber x = new ContaReceber("Supermercado", LocalDateTime.parse("2023-10-05T00:00:00"), 1000, true);
        ContaReceber y = new ContaReceber("Clínica", LocalDateTime.parse("2024-01-03T00:00:00"), 2000, true);
        ContaReceber z = new ContaReceber("Mercado", LocalDateTime.parse("2022-02-10T00:00:00"), 1500, true);

        ContaReceber[] array = {x, y, z};
        ContaReceber[] aux = new ContaReceber[3];
        System.arraycopy(array, 0, aux, 0, 3);
        Arrays.sort(aux);
        for (int i = 0; i < 3; i++){
            System.out.println(aux[i].toString());
        }
    }
}

class ContaReceber implements Comparable{
    private String cliente;
    private LocalDateTime data;
    private double valor;
    private boolean recebido;
    private int aux;

    public ContaReceber(String cliente, LocalDateTime data, double valor, boolean recebido){
        SetCliente(cliente);
        SetData(data);
        SetValor(valor);
        SetRecebido(recebido);
    }
    public String GetCliente(){
        return cliente;
    }
    public void SetCliente(String valor){
        if (valor != "") cliente = valor; 
    }

    public LocalDateTime GetData(){
        return data;
    }
    public void SetData(LocalDateTime data){
        int ano = data.getYear();
        LocalDateTime hoje = LocalDateTime.now();
        int anoatual = hoje.getYear();
        if (anoatual - ano <= 3) this.data = data;
    }

    public double GetValor(){
        return valor;
    }
    public void SetValor(double valor){
        if (valor >= 0) this.valor = valor;
    }

    public boolean GetRecebido(){
        return recebido;
    }
    public void SetRecebido(boolean recebido){
        this.recebido = recebido;
    }

    public void Receber(){
        this.recebido = true;
    }

    public String toString(){
        return "CLIENTE: " + this.cliente + "\n" +
        "DATA: " + this.data + "\n" +
        "VALOR: " + this.valor;
    }

    @Override
    public int compareTo(Object obj){
        ContaReceber refr = (ContaReceber) obj;
        if (this.data.compareTo(refr.data) > 0) aux = 1;
        if (this.data.compareTo(refr.data) == 0) aux = 0;
        if (this.data.compareTo(refr.data) < 0) aux = -1;
        return aux;
    }
}