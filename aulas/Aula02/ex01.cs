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

    Console.WriteLine("Digite o seu nome");
    string s = Console.ReadLine(); //input
    Console.WriteLine("Olá, " + s);

    Console.WriteLine("Digite um valor inteiro");
    int i = int.Parse(Console.ReadLine()); //int(input())
    Console.WriteLine("i * 2 = " + (i+i));

    //concatenação e conversão
    Console.WriteLine(1 + abc); //1abc
    Console.WriteLine('1' + '1') //98 (soma os valores ASCII dos caracteres)
    Console.WriteLine("1" + "1") //11
    Console.WriteLine("1" + '1') //11 (conversão da linguagem)
    double x = 1.5;
    int y = (int) x; // conversão de número real para inteiro
    Console.WriteLine(x);
    Console.WriteLine(y);
        //conversão de texto para real
    s = "10.23";
    double z = double.Parse(s);
    Console.WriteLine("Soma " + (z+z));
        //conversão de real para texto
    z = 8.9;
    s = z.ToString();
    Console.WriteLine("Concatenação "+s+s);
  }
}