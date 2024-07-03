import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // String nome, agencia;
        //int conta;
        // double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, peço que por gentileza me informe seguintes dados: ");
        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Número da agência: ");
        String agencia = scanner.next();

        System.out.println("Número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
