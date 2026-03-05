import java.util.Scanner;

public class SistemadeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segumda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        String verficarSituacao = verificarSituacao(media);

        System.out.println("Média: " + media);
        System.out.println("Resultado: " + verficarSituacao);

        scanner.close();

    }

    public static double lerNotaInvalida(Scanner scanner, String mensagem) {
        double nota;

        while (true) {
            System.out.print(mensagem);
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        }
    }

    public static double calcularMedia( double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Você está aprovado!";
        } else if (media >= 5) {
            return "Você está de recuperação!";
        } else {
            return "Você está reprovado!";
        }
    }

}
