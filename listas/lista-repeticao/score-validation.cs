using System;

class Programa{
    public static void Main(){
        double nota_total = 0;
        int i = 0;
        while (i != 2){
            double nota = double.Parse(Console.ReadLine());
            if (nota < 0 || nota > 10){
                Console.WriteLine("nota invalida");
            }
            else{
                i++;
                nota_total += nota;
            }
        }
        Console.WriteLine($"media = {nota_total/2}");
    }
}