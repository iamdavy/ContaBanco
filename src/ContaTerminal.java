import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia = getInput("Por favor, digite o número da Agência: ", scanner);
        int numero = Integer.parseInt(getInput("Por favor, digite o número da Conta: ", scanner));
        String nomeCliente = getInput("Por favor, digite o nome do Cliente: ", scanner);
        double saldo = Double.parseDouble(getInput("Por favor, digite o saldo da Conta: ", scanner));

        scanner.close();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
    }

    public static String getInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
