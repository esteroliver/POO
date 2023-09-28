import static java.lang.System.out;

class MainClass{
    public static void main (String args[]){
        Triangulo x = new Triangulo();
        x.b = 10;
        x.h = 20;
        double area = x.CalcArea();
        out.println(area);
    }
}

class Triangulo{
    public double b, h;
    public double CalcArea(){
        return b * h / 2;
    }
}