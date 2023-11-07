using System;

class Programa{
    public static void Main(){
        Console.WriteLine("Nota 1° bimestre:");
        int nota1 = int.Parse(Console.ReadLine());
        Console.WriteLine("Nota 2° bimestre:");
        int nota2 = int.Parse(Console.ReadLine());

        nota1 = nota1*2;
        nota2 = nota2*3;
        int media = nota1 + nota2;
        Console.WriteLine($"Média parcial = {media/5}");
    }
}