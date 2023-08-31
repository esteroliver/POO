using System;

class Aula02{
  public static void Main(){
    // 5 tipos básicos de dados
    int a = 5;
    double b = 4.5;
    char c = '$';
    string d = "Programação";
    bool e = true;
    Console.WriteLine(a);
    Console.WriteLine(b);
    Console.WriteLine(c);
    Console.WriteLine(d);
    Console.WriteLine(e);

    string s = Console.ReadLine(); //input
    Console.WriteLine(s+s); 

    int i = int.Parse(Console.ReadLine()); //int(input())
    Console.WriteLine(i+i);
  }
}