class Programa{
    public static void main(String args[]){
        Lista x = new Lista();
        x.Inserir("A");
        x.Inserir("B");
        x.Inserir("C");
        x.Inserir("D");
        x.Inserir("E");
        System.out.println(x.Listar());
    }
}


class Lista{
    private Node inicio = null, fim = null;
    public void Inserir(String valor){
        Node novo = new Node();
        novo.valor = valor;
        if (inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.prox = novo;
            fim = novo;
        }
    }
    public String Listar(){
        String r = "[";
        Node aux = inicio;
        while (aux != null) {
            r += aux.valor + ", ";
            aux = aux.prox;
        }
        r += "]";
        return r;
    }
}

class Node{
    public String valor;
    public Node prox;
}