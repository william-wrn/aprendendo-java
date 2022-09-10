package funcoes;

public class FuncaoSemParametro {
    static float n1, n2, resposta;

    public static float soma() {
        float aux;
        aux = n1 + n2;
        return aux;
    }

    public static void main(String[] args) {
        n1 = 10;
        n2 = 20;
        float x = soma();
        System.out.println(x);
    }
}
