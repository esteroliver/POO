using System;

class Triangulo{
    public static void Main(){
        double a, b, h;
        Console.WriteLine("Digite a base do triângulo.");
        b = double.Parse(Console.ReadLine());
        Console.WriteLine("Digite a altura do triângulo.");
        h = double.Parse(Console.ReadLine());
        a = (b*h)/2;
        Console.WriteLine($"Área = {a:0.00}");
    }
}