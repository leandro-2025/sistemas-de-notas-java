package app;

import service.SistemaNotasService;

import java.util.Scanner;

public class SistemadeNotas {

    public static void main(String[] args) {

        SistemaNotasService service = new SistemaNotasService();

        Scanner scanner = new Scanner(System.in);

        double nota1 = lerNotavalida(scanner, "Digite sua primeira nota: ");
        double nota2 = lerNotavalida(scanner, "Digite sua segunda nota: ");
        double nota3 = lerNotavalida(scanner, "Digite sua terceira nota: ");

        double media = service.calcularMedia(nota1, nota2, nota3);
        String verficarSituacao = service.verificarSituacao(media);

        System.out.println("\nMédia: " + media);
        System.out.println("Resultado: " + verficarSituacao);

        scanner.close();

    }

    public static double lerNotavalida(Scanner scanner, String mensagem) {
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
