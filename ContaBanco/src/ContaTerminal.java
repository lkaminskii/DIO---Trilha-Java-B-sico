import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numero = input.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        input.nextLine();
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        input.close();
    }
}