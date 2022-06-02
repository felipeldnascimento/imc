package Imc;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Vamos calcular seu Índice de Massa Corporal (IMC).");

        System.out.println("Informe seu peso.");
        double peso = s.nextDouble();

        System.out.println("Agora informe sua altura.");
        double altura = s.nextDouble();

        double imc = peso / (altura*altura);
        String classificacao = "";

        if(imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc > 18.6 && imc <= 24.9) {
            classificacao = "Peso ideal (parabéns)";
        } else if (imc > 24.9 && imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        } else if (imc > 29.9 && imc <= 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc > 34.9 && imc <= 39.9) {
            classificacao = "Obesidade grau II (severa)";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }

        System.out.println("Resultado.: ");
        System.out.println("Peso informado: " + peso + "kg");
        System.out.println("Altura informada: " + altura + "m");
        System.out.println("Seu IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
    }
}