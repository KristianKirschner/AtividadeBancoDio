import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        String nome, numAgencia;
        int numConta;
        Double saldo;


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        nome = sc.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");
        numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência !");
        numAgencia = sc.nextLine();


        System.out.println("Por favor, digite o seu saldo !");
        saldo = sc.nextDouble();
        sc.nextLine();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo de R$" + saldo + " já está disponível para saque");
  
    }
}
