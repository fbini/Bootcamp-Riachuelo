package br.com.dio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("Digite um número para a tábuada: ");
        int recebeNumeroTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            int tabuada = recebeNumeroTabuada * i;
            System.out.println(recebeNumeroTabuada + " x " + i + " = " + tabuada);
        }

        //2
        System.out.println("** Calcule seu IMC **");
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        double resultadoImc = peso / (altura * altura);

        System.out.println(resultadoImc);

        if (resultadoImc <= 18) {
            System.out.println("Abaixo do peso");
        } else if (resultadoImc >= 18 && resultadoImc <= 24){
            System.out.println("Peso ideal");
        } else if (resultadoImc >= 25 && resultadoImc <= 29) {
            System.out.println("Levemente acima do peso");
        } else if (resultadoImc >= 30 && resultadoImc <= 34) {
            System.out.println("Obesidade grau I");
        } else if (resultadoImc >= 35 && resultadoImc <= 39) {
            System.out.println("Obesidade grau II severa ");
        } else {
            System.out.println("Obesidade III (Mórbido");
        }


        //3


    }

}
