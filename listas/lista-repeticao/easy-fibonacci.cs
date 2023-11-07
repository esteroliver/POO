using System;

class Programa{
    public static void Main(){
        int inicio = 0;
        int posterior = 1;
        int num = int.Parse(Console.ReadLine());
        int[] sequencia = new int[num];
        for (int i = 0; i<num; i++){
            sequencia[i] = inicio;
            int post_sub = posterior;
            posterior = inicio + posterior;
            inicio = post_sub;
        }
        for (int j = 0; j<num-1; j++)
            Console.Write($"{sequencia[j]} ");
        Console.Write(sequencia[num-1]);
        Console.WriteLine();
    }
}