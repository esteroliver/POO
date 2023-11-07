class Triangulo{
    private double b, h; // Encapsulamento, para evitar o armazenamento de valores indevidos

    // CONSTRUTORES
    public Triangulo(double b, double h){
        setBase(b);
        setAltura(h);
    }
    public Triangulo(){ }

    // SET - para os valores privados serem armazenados
    public void setBase(double b){
        if(b > 0) this.b = b;
        else throw new IllegalArgumentException();
    }

    public void setAltura(double h){
        if(h > 0) this.h = h;
        else throw new IllegalArgumentException();
    }
    // GET - para os valores privados serem acessados
    public double getBase(){ return b; }
    public double getAltura(){ return h; }

    //TOSTRING - retorna como texto os dados
    public String toString(){
        return "Base: " + b + "\n" +
        "Altura" + h;
    }
}

class Main{
    public static void main(String args[]){

    }
}
