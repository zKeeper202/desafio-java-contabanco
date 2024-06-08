import java.util.Scanner;
public class ContaTerminal 
{
    public static void main(String[] args)
    {
        //TODO:"Conhecer e importar a classe Scanner"
        Scanner sc = new Scanner(System.in);

         //Obter pela classe scanner os valores digitados no terminal
         System.out.println("Por favor digite seu nome: ");
         String nomeCliente = sc.nextLine();

         System.out.println("Digite o numero de sua agencia: ");
         String agencia = sc.nextLine();

         System.out.println("Digite o numero da sua conta :");
         int numero = sc.nextInt();

         System.out.println("Digite seu saldo atual: ");
         double saldo = sc.nextDouble();
            //Exibir as mensagens para o usuario
            String mensagem = "Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco. Sua agencia é "
            +agencia+ ", sua conta é "
            +numero+ " e seu saldo de " 
            +saldo+ " ja esta disponivel para saque!";


            //Exibir a mensagem que a conta foi criada com suceso
            System.out.println(mensagem);
        sc.close();
    }
}
