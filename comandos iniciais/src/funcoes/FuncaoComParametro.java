package funcoes;

public class FuncaoComParametro {
    static float n1, n2, resposta;

    public static float soma(float n1, float n2) {
        float aux;
        aux = n1 + n2;
        return aux;
    }

    public static void main(String[] args) {
        n1 = 10;
        n2 = 20;
        float x = soma(n1,n2);
        System.out.println(x);
    }
}
