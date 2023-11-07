using System;
using System.Collections.Generic;

class Programa{
    public static void Main(){
        Console.WriteLine("Digite seu nome completo.");
        string nome = Console.ReadLine();
        string[] p_nome = nome.Split(' ');
        Console.WriteLine($"Bem-vindo ao C#, {p_nome[0]}");
    }
}