using System;
using System.Collections.Generic;

class Ex01{
    public static void Main(){
        List<string> z = new List<string>();
        z.Add("Eu sou um elemento da lista");
        Console.WriteLine(z[0]);
        z.Add("Eu sou outro elemento da lista");
        Console.WriteLine(z[1]);

        int x = int.Parse(Console.ReadLine());
        Console.WriteLine(x+x);

        double y = double.Parse(Console.ReadLine());
        Console.WriteLine(y/x);
    }
}