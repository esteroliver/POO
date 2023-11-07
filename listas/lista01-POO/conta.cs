using System;

class Conta{
    public string nome;
    public int numero;
    public double saldo;
    public double Deposito(double dep){
        return saldo + dep;
    }
    public double Saque(double saq){
        return saldo - saq;
    }
}

class Programa{
    public static void Main(){
        Conta x;
        x = new Conta();
        x.nome = "Ester";
        x.numero = 22222;
        x.saldo = 500.50;
        Console.WriteLine(x.Deposito(50));
        x.saldo = x.Deposito(50);
        Console.WriteLine(x.Saque(20));
    }
}