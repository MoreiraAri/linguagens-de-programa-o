import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao;
        do {
            System.out.println("Menu Lotofacil : ");
            System.out.println("1) Aposta de 0 a 100");
            System.out.println("2) Aposta de A a Z");
            System.out.println("3) Aposta em par ou impar");
            System.out.println("0) Sair");
            System.out.println("Escolha uma opcao : ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apostade0a100(scanner, random);
                    break;

                case 2:
                    apostadeAaZ(scanner);
                    break;

                case 3:
                    apostaemparouimpar(scanner, random);
                    break;

                case 0:
                    System.out.println("Digite 0 para sair");
                    break;
                default:
                    System.out.println("Opcao invalida digite novamente");
            }
        } while (opcao != 0);
        scanner.close();
        {
        }
    }
    private static void apostade0a100(Scanner scanner, Random random) {
        System.out.println("Aposta de 0 a 100");
        System.out.print("Digite um numero de 0 a 100: ");
        int aposta = scanner.nextInt();

        if (aposta < 0 || aposta > 100) {
            System.out.println("Aposta inválida.");
            return;
        }
        int numeroSorteado = random.nextInt(101);
        System.out.println("Numero sorteado: " + numeroSorteado);
        if (aposta == numeroSorteado) {
            System.out.println("Voce ganhou R$ 1.000,00 reais");

        } else {

            System.out.println("Que pena! O numero sorteado foi: " + numeroSorteado);
        }

    }
    public static void apostadeAaZ(Scanner scanner) throws IOException, IOException {
        System.out.println("Aposta de A a Z...");
        System.out.print("Digite uma letra de A à Z: ");
        char opcao = (char) System.in.read();
        char aposta = Character.toUpperCase(scanner.next().charAt(0));

        if (!Character.isLetter(aposta) || aposta < 'A' || aposta > 'Z') {
            System.out.println("Aposta inválida.");
            return;
        }

        char letraPremiada = 'J';
        System.out.println("Letra premiada: " + letraPremiada);

        if (aposta == letraPremiada) {
            System.out.println("Você ganho R$500,00 reais");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
        }
    }
    private static void apostaemparouimpar(Scanner scanner, Random random) {
        System.out.println("Aposta em par ou ímpar");
        System.out.print("Digite um número inteiro");
        int aposta = scanner.nextInt();

        if (aposta % 2 == 0) {
            System.out.println("Você ganhou R$100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é impar e a premiação foi números pares.");
        }
    }
}








