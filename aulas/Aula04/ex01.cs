using System;
using System.Collections.Generic;

class Programa{
    public static void Main(){
        int i;
        for (i = 1; i <= 10; i++){
            Console.WriteLine(i);
        }
        i = 0;
        while(i<=9){
            i++;
            Console.WriteLine(i);
        }
        i = 1;
        do {
            Console.WriteLine(i);
            i++;
        } while(i <= 5);
        int[] v = {5, 3, 1};
        foreach(int k in v) Console.WriteLine(k);
        foreach(char c in "Programação") Console.WriteLine(c);
        List<int> lista = new List<int> {1,4,6,3,5,2};
        lista.Add(0);
        lista.Sort();
        foreach(int n in lista) Console.WriteLine(n);
    }
}