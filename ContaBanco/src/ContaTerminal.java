import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe scanner
        // TODO: Exibir as mensagens para o nosso usuário
        // TODO: Obter pela classe scanner os valores digitados no terminal
        // TODO: Exibir a mensagem final da conta criada

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o número da sua agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo: "); 
        saldo = scanner.nextDouble();



        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
