class Main {
    public static void main(String args[]){
        int vetor_int[]; //referência
        vetor_int = new int[10]; //vetor

        double vetor_real[] = new double[14];

        String[] nomes = new String[] {"Ester", "Débora", "Felipe", "Theo"};

        int numeros[] = new int[4];

        for (int i = 0; i < 4; i++){
            numeros[i] = i+1;
        }

        for (int i : numeros) {
            System.out.println(i);
        }

        int numeros_copia[] = numeros.clone();

        for (int i : numeros_copia) {
            System.out.println(i);
        }
    }
    
}
