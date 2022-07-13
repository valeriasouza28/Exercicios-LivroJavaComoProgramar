import java.util.Arrays;
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        //Exemplo3

        //Entrada e saa de números de ponto flutuante com objetos Account
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John", -7.53);

        //exibe saldo inicial de cada objeto
        System.out.printf("%s saldo: $%.2f %n", account1.getNome(), account1.getSaldo());
        System.out.printf("%s saldo: $%.2f %n", account2.getNome(), account2.getSaldo());

        //cria um Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantia de deposito para account1: "); //prompt
        double depositaQuantia = input.nextDouble(); //obtém a entrada do usuário
        System.out.printf("%nadicionando %.2f para saldo account1%n%n", depositaQuantia);
        account1.deposito(depositaQuantia); //adiciona saldo de account1

        //exibe saldos
        System.out.printf("%s saldo: $%.2f %n", account1.getNome(), account1.getSaldo());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getNome(), account2.getSaldo());

        System.out.print("Digite quantia de deposito para account2: "); //prompt
        depositaQuantia = input.nextDouble(); //obtem entrada de usuário
        System.out.printf("%nadicionando %.2f para saldo account2%n%n", depositaQuantia);
        account2.deposito(depositaQuantia); //adiciona ao saldo de account2

        //exibe saldos após depositos
        System.out.printf("%s saldo: $%.2f %n", account1.getNome(), account1.getSaldo());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getNome(), account2.getSaldo());

        System.out.print("Digite a quantia de saque para account1: ");
        double saqueQuantia = input.nextDouble();
        if (saqueQuantia > account1.getSaldo())
        System.out.println("Valor do saque excede saldo da conta");
        else  {

            System.out.printf("%nretirando %.2f para saldo account1%n%n", saqueQuantia);
            account1.saque(saqueQuantia );
        }

        //exibe saldos
        System.out.printf("%s saldo: $%.2f %n", account1.getNome(), account1.getSaldo());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getNome(), account2.getSaldo());

        System.out.print("Digite a quantia de saque para account2: ");
        saqueQuantia = input.nextDouble();
        if (saqueQuantia > account1.getSaldo())
            System.out.println("Valor do saque excede saldo da conta");
        else  {

            System.out.printf("%nretirando %.2f para saldo account1%n%n", saqueQuantia);
            account1.saque(saqueQuantia );
        }



        /*
        //Exemplo2

        //Cria dois objetos Account
        Account account1 = new  Account("Jane Green");
        Account account2 = new Account("John Blue");

        //exibe o valor inicial de nome para cada Account
        System.out.printf("account name is : %s%n", account1.getName());
        System.out.printf("account name is : %s%n", account2.getName());
        */

        /* //Exemplo1
        //cria  um objeto para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //cria um objeto Account e o atribui  a myAccount
        Account myAccount = new Account();

        //exibe um valor inicial do nome (null)
        System.out.printf("Initial  name is: %s%n", myAccount.getName());

        //solicita e lê o nome
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); //lẽ linha de texto
        myAccount.setName(theName); //insere theName em myAccount
        System.out.println(); //gera saída de uma linha ema branco

        //exibe o nome  armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
*/

    }
}
