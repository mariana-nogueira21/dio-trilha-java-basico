
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = leitura.nextLine();

        System.out.println("Digite o numero da agência:");
        int agencia = leitura.nextInt();

        System.err.println("Digite o numero da conta:");
        int numero = leitura.nextInt();

        System.out.println("Digite o saldo da conta");
        double saldo = leitura.nextDouble();


        Conta conta = new Conta(agencia, numero, saldo, nome);

        System.err.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
