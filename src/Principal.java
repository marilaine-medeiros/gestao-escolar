import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Boas vindas ao sistema de gestão escolar!");

        //scanner que vai ler algo do teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do estudante: ");
        int idade = leitor.nextInt();

        System.out.println("Digite a nota 1 do estudante: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 do estudante: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3 do estudante: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media do estudante: " +media);

        boolean aprovado = true;
        if (media >= 7) {
            System.out.println("Estudante aprovado!");
        } else {
            System.out.println("Estudante reprovado!");
            aprovado = false;
        }

        System.out.println(aprovado);


        /*
        boolean passou = nota >= 7.0;


        > maior do que
        < menor do que
        >= maior ou igual
        <= menor ou igual
        == igual a
        != diferente de


        if (nota == 10) {
            System.out.println("Parabéns! Prova gabaritada");
        }

        if(passou) {
            System.out.println("O estudante: " +nome +" passou com nota: " +nota);
        } else {
            System.out.println("O estudante: " +nome +" reprovou com: " +nota);
        }

        */


    }
}
