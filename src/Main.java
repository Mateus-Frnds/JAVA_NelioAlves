// import de classe locale para trocar
// a localizacao do app Java.
// Obs: 'Locale' funciona apenas a partir do momento 
// em que é aplicado.
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // var double usada para numero com ponto flutuante
        // de maneira menos precisa que float:
        double x = 10.35784;

        // var String usada para textos:
        String nome = "Maria";

        // var int usada para numeros inteiros:
        int idade = 31;
        double renda = 4000.0;

        // padrao de mascara de formatacao: '%.2f%n'
        // necessario o uso do 'printf'
        System.out.printf("%.2f%n", x);

        // Exemplo de concatenacao logo abaixo:
        System.out.println("Resultado = " + x + " metros");

        // Exemplos de concatenacao de varios elementos em um mesmo
        // elemento de escrita:
        // Obs: O '%.2f' substitui o valor de x, e o '%n' demarca
        // quebra de linha.

        // Exemplo 1:
        System.out.printf("Resultado = %.2f metros%n", x);

        // Exemplo 2:
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", 
        nome, idade, renda);

    }

}
