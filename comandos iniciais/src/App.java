import java.util.Scanner;

/* Nomenclaturas no JAVA
- Pacote (letra minúscula e separado por ponto se tiver várias palavras)
- Classe (Começa com a letra maíuscula e ser um substantivo: Cor,Interruptor,Cliente,...)
- Interface (Comeca e maiúsculo e descreve a ação que a classe faz: Runnable, Comparable, Enumerable)
- Metodo (Começa em minúscula e a próxima palavra maiúscula, verbo: acender,desligar,...)
- Variavel (comeca em minúsculo, não começa com caráteres especiais, recomendável não usar)
- Constante (em maiúsculo separado por '_': MAX_PRIORITY)
*/
public class App {
    public static void main(String[] args) throws Exception {
        // Imprimindo dados
        System.out.println("Hello, World!");
        // Criando variáveis e atribuíndo valores

        int num;
        num = 2;
        String texto = "Texto informado!";
        System.out.println("num="+num+" texto="+texto);

        // Solicitando dados
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome:");
        nome = scan.next();
        System.out.println("Olá "+nome);
        
        // Tipos de operadores
        System.out.println("Operadores aritméticos: +, -, *, /, %, ++, --");
        System.out.println("Operadores de comparação: >, <, ==, >=, <=, !=");
        System.out.println("Operadores lógicos: &&, ||");
        System.out.println("Operadores de atribuição: =, +=, -=");
    }
}
