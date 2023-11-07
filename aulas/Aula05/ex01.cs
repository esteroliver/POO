using System;

class Programa{
    public static void Main(){
        int numero = int.Parse(Console.ReadLine());
        Console.WriteLine(Funcoes.Primo(numero));

        Console.WriteLine("Digite a base e a altura do triângulo, respectivamente.");
        double bas = double.Parse(Console.ReadLine());
        double altura = double.Parse(Console.ReadLine());
        double area = Figuras.AreaTriangulo(bas, altura);
        Console.WriteLine($"Área do triângulo = {area}");
        Imprimir("oI");
    }
    public static void Imprimir(string x){
        Console.WriteLine(x);
    }
}

class Funcoes{
    public static bool Primo(int x){
        bool div = true;
        if (x == 1) div = false;
        for (int i = 2; i < x; i++){
            if (x%i == 0) div = false;
        }
        return div;
    }
}

class Figuras{
    public static double AreaTriangulo(double b, double h){
        double area = (b * h)/2;
        return area;
    }
}