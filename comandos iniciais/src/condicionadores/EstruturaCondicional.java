package condicionadores;

public class EstruturaCondicional {
    public static void main(String[] args) {
        double numero = 10.50;
        if (numero < 0) {
            System.out.println("Menor que '0'");
        } else if (numero == 10.5) {
            System.out.println("O número é igual a 10.5");
        } else {
            System.out.println("Este caso é diferente do que ja tratamos!");
        }
    }
}
