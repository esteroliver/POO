using System;

class Disciplina{
    public string nome;
    public double nota1, nota2, nota3, nota4, final;
    public double Media(){
        double media = (nota1+nota2+nota3+nota4)/4;
        if (media < 60){
            media = (nota1+nota2+nota3+nota4+final)/5;
        }
        return media;
    }
}

class Programa{
    public static void Main(){
        Disciplina x;
        x = new Disciplina();
        x.nota1 = 60;
        x.nota2 = 55;
        x.nota3 = 40;
        x.nota4 = 30;
        x.final = 70;
        Console.WriteLine(x.Media());
    }
}