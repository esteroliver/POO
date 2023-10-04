import java.util.Scanner;

class Programa{
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Digite o X e o Y do ponto 1.");
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();
        PontoXY p1 = new PontoXY(num1, num2);
        System.out.println("Digite o X e o Y do ponto 2.");
        double num3 = inp.nextDouble();
        double num4 = inp.nextDouble();
        PontoXY p2 = new PontoXY(num3, num4);

        System.out.println("Distância dos pontos 1 e 2 da origem.");
        System.out.println(p1.Origem());
        System.out.println(p2.Origem());
        
        System.out.println("Soma dos pontos 1 e 2.");
        PontoXY p3 = p1.Somar(p2);
        System.out.println(p3.ToString());
    }
}

class PontoXY{
    private double x, y;
    //CONSTRUTOR
    public PontoXY(double x, double y){
        SetX(x);
        SetY(y);
    }
    //SET VALORES
    public void SetX(double x){
        this.x = x;
    }
    public void SetY(double y){
        this.y = y;
    }
    //VISUALIZAR VALORES
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    //CÁLCULOS FODAS
        //DISTÂNCIA DO PONTO ATÉ ORIGEM (0,0)
    public double Origem(){
        return (x*x) + (y*y);
    }
        //SOMA DE DOIS PONTOS
    public PontoXY Somar(PontoXY p2){
        return new PontoXY(x + p2.x , y + p2.y);
    }
    //MOSTRAR VALORES EM STRING
    public String ToString(){
        return "X: " + x + "\n" + "Y: " + y; 
    }
}
