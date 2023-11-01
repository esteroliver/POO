import java.time.LocalDate;
import java.util.Arrays;

public class ex02 {
    public static void main(String args[]){
        Conta x = new Conta("Supermercado", LocalDate.parse("2023-10-10"), 700, true);
        Conta y = new Conta("Água", LocalDate.parse("2023-10-07"), 70, false);
        Conta z = new Conta("Internet", LocalDate.parse("2023-10-30"), 100, false);
        Conta w = new Conta("Aluguel", LocalDate.parse("2023-10-02"), 700, true);

        Financeiro contas = new Financeiro();
        contas.Inserir(x);
        contas.Inserir(y);
        contas.Inserir(z);
        contas.Inserir(w);

        System.out.println("TODAS AS CONTAS");
        for (Conta c : contas.Listar()){
            System.out.println(c.toString());
        }
        System.out.println("----------------------");
        System.out.println("CONTAS RECEBIDAS");
        for (Conta cr : contas.ContasRecebidas()){
            System.out.println(cr.toString());
        }
    }
    
}

class Conta implements Comparable{
    private String cliente;
    private LocalDate data;
    private double valor;
    private boolean recebido;
    private int aux;

    public Conta(String cliente, LocalDate data, double valor, boolean recebido){
        SetCliente(cliente);
        SetData(data);
        SetValor(valor);
        SetRecebido(recebido);
    }
//  métodos de SET
    public void SetCliente(String cliente){
        if(cliente != "") this.cliente = cliente;
    }
    public void SetData(LocalDate data){
        this.data = data;
    }
    public void SetValor(double valor){
        if (valor > 0) this.valor = valor;
    }
    public void SetRecebido(boolean recebido){
        this.recebido = recebido;
    }
//  métodos de GET
    public String GetCliente(){
        return cliente;
    }
    public LocalDate GetData(){
        return data;
    }
    public double GetValo(){
        return valor;
    }
    public boolean GetRecebido(){
        return recebido;
    }
//  método para receber o pagamento
    public void Receber(){
        this.recebido = true;
    }
//  to string dos dados
    public String toString(){
        String rec;
        if (recebido) rec = "Conta recebida.";
        else rec = "Conta não recebida.";
        return "CLIENTE: " + cliente + "\n" +
        "DATA: " + data + "\n" + 
        "VALOR: " + valor + "\n" +
        "ESTADO: " + rec + "\n";
    }
// compareTo
    @Override
    public int compareTo(Object obj){
        Conta refr = (Conta) obj;
        if (this.data.compareTo(refr.data) > 0) aux = 1;
        if (this.data.compareTo(refr.data) == 0) aux = 0;
        if (this.data.compareTo(refr.data) < 0) aux = -1;
        return aux;
    }
}

class Financeiro{
    private Conta[] contas = new Conta[10];
    private int k = 0;

    public void Inserir(Conta c){
        if (k < 10) contas[k] = c;
        k++;
    }
    public Conta[] Listar(){
        Conta[] aux = new Conta[k];
        System.arraycopy(contas, 0, aux, 0, k);
        Arrays.sort(aux);
        return aux;
    }
    public Conta[] ContasRecebidas(){
        int contador = 0;
        for (Conta c : Listar()){
            if (c.GetRecebido()) contador++;
        }
        Conta[] aux = new Conta[contador];
        int i = 0;
        for (Conta cr : Listar()){
            if (cr.GetRecebido()) aux[i++] = cr;
        }
        Arrays.sort(aux);
        return aux;
    }
}