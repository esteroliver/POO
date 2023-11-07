using System;

class Circulo{
    public double raio;
    public double Area(){
        return 3.14 * (raio*raio);
    }
}

class Programa{
    public static void Main(){
        Circulo x;
        x = new Circulo();
        x.raio = 4;
        Console.WriteLine(x.Area());
    }
}