package service;

public class SistemaNotasService {

    public double calcularMedia(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }

    public String verificarSituacao(double media){
        if (media >= 7){
            return "Aprovado";
        } else if (media >= 5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

}
