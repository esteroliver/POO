using System;

class Programa{
    public static void Main(){
        Console.WriteLine("Digite o intervalo de tempo no formato HH:MM:SS");
        string tempo = Console.ReadLine();
        string[] c_tempo = tempo.Split(':');
        long segundos = int.Parse(c_tempo[0])*3600 + int.Parse(c_tempo[1])*60 + int.Parse(c_tempo[2]);
        long velocidade = segundos * 300000;

        Console.WriteLine($"A luz percorreu {velocidade} km nesse intervalo.");

    }
}