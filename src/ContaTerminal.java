import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int saldo = 5000;
        String agencia = "";
        String nomeCliente = "";
        int numero;

        Scanner scanner = new Scanner(System.in);


       
       System.out.println("Informe o seu nome!");
       nomeCliente = scanner.next();


       System.out.println("Informe a agência!");
       agencia = scanner.next();
       
       
        System.out.println("Informe o número da conta");
        numero = scanner.nextInt();


        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero  + "e seu saldo R$" + saldo +  " já está disponível para saque");
        


    }
}
