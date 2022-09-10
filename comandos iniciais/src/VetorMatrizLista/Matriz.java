package VetorMatrizLista;

public class Matriz {
    public static void main(String[] args) {
        int[][] nota = new int[2][2];

        nota[0][0] = 5;
        nota[0][1] = 6;
        nota[1][0] = 7;
        nota[1][1] = 8;

        for (int l = 0;l<2;l++){
            for (int c = 0;c<2;c++){
                System.out.println(nota[l][c]);
            }
        }

    }
}
