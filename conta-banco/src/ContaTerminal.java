import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);      
       
        //Exibir as mensagens para o nosso usuário
        System.out.println("favor, digite o número da Agência !");
        //Obter pela Scanner os valores digitados no terminal
        int numeroConta = scanner.nextInt();

        System.out.println("favor, digite a Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("favor, digite seu nome !");
        String nomeCliente = scanner.next();

        System.out.println("favor, digite seu saldo !");
        double saldoBancario = scanner.nextDouble();
        
       //Exibir a mensagem conta criada
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
       ", conta " + numeroConta + " e seu saldo " + saldoBancario + " já está disponível para saque");

    }
}
