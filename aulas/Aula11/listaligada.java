class Programa{
    public static void main(String args[]){
        Lista numeros = new Lista();
        numeros.InserirInicio("1");
        numeros.InserirInicio("2");
        numeros.InserirInicio("3");
        System.out.println(numeros.Listar());
        Lista texto = new Lista();
        texto.InserirFim("Ester");
        texto.InserirFim("Oliveira");
        texto.InserirFim("Melo");
        System.out.println(texto.Listar());
    }
}


class Lista{
    private Node inicio = null, fim = null;
    public void InserirInicio(String valor){
        Node novo = new Node();
        novo.valor = valor;
        novo.prox = inicio;
        inicio = novo;
        if(fim == null){
            fim = novo;
        }
    }
    public void InserirFim(String valor){
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