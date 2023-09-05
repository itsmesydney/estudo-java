import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Você tem " + idade + " anos de idade");
        System.out.println("Medindo " + altura);



    }
}
