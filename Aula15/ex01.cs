using System;

class Programa{
    public static void Main(){
        Triangulo x = new Triangulo(10,20);
        Triangulo y = new Triangulo { Base = 30, Altura = 50};
        Console.WriteLine(x.Area);
        Console.WriteLine(y.Area);

        Triangulo z = new Triangulo();
        Console.WriteLine("Escreva um valor para a base:");
        double b;
        while (!double.TryParse(Console.ReadLine(), out b));
        z.Base = b;
        Console.WriteLine("Escreva um valor para a altura:");
        double h;
        while (!double.TryParse(Console.ReadLine(), out h));
        z.Altura = h;
        
        Console.WriteLine(z.Area);

    }
}

class Triangulo{
    private double b, h;
    public Triangulo(){}
    public Triangulo(double b, double h){
        Base = b;
        Altura = h;
    }
    public double Base{
        get {return b;}
        set {if (value > 0) b = value;}
    }
    public double Altura{
        get {return h;}
        set {if (value > 0) h = value;}
    }
    public double Area{
        get {return b * h / 2;}
    }
}