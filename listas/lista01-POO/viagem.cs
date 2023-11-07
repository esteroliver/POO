using System;

class Viagem{
    public double km, h;
    public double Velocidade(){
        return km/h;
    }
}

class Programa{
    public static void Main(){
        Viagem x;
        x = new Viagem();
        x.km = 300;
        x.h = 3;
        Console.WriteLine(x.Velocidade());
    }
}