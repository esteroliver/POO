class Main {
    public static void main(String args[]){
        int[][] matriz_1 = new int[5][8]; 

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                matriz_1[i][j] = i+j;
            }
        }

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(matriz_1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matriz_2 = new int[][] {
            {1,2,3,4},
            {2,4,6,8},
            {10,20,30,40}};
    
        int x = matriz_2[1][2]; //6 - linha 1, coluna 2
        System.out.println(x);
    }
}
