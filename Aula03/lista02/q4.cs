using System;

namespace MathClassCS
{
    
}

class Programa{
    public static void Main(){
        Console.WriteLine("Digite a base a altura do retângulo");
        double bas = double.Parse(Console.ReadLine());
        double alt = double.Parse(Console.ReadLine());

        double area = bas*alt;
        double perimetro = (bas*2) + (alt*2);
        double diagonal = Math.Sqrt((bas*bas)+(alt*alt));

        Console.WriteLine($"Área = {area:0.00} - Perímetro = {perimetro:0.00} - Diagonal = {diagonal:0.00}");
    }
}