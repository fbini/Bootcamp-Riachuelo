import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("Escreva seu nomes: ");
        String nome = scanner.next();
        System.out.println("Escreva sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + " você tem " + idade + " anos \n");

        //2
        System.out.println("Calcule a área do quadrado" );
        System.out.println("Digite um dos lados do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        double resuldaoQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é de: " + resuldaoQuadrado + "cm²");

        //3
        System.out.println("Calcule a área do retângulo");
        System.out.println("Digite a base do retângulo: ");
        double baseRetangulo = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double alturaRetangulo = scanner.nextDouble();
        double areaRteangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo é de: " + areaRteangulo);

        //4
        System.out.println("Descubra a diferença de idade de duas pessoas");

        System.out.println("Escreva o primeiro nome: ");
        String nome1 = scanner.next();
        System.out.println("Escreva o segundo nome: ");
        String nome2 = scanner.next();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferencaDeIdade = idade1 - idade2;
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaDeIdade + " anos");






    }
}
