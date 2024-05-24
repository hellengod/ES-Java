import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Dados iniciais
        String nome = "Hellen Bianchini";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 1;

        System.out.println("******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************************");

        while(opcao != 4) {
            System.out.println("""
                    Digite 1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair""");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja receber: ");
                    double receber = scan.nextDouble();
                    if (receber > 0) {
                        saldo += receber;
                        System.out.println("Saldo atual: " + saldo);
                    } else{
                        System.out.println("Valor invalido!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");

                    double transferir = scan.nextDouble();
                    if (transferir < saldo) {
                        saldo -= transferir;
                        System.out.println("Saldo atual: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    break;
            }
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                System.out.println("Opção invalida!!!");
            }
        }
    }
}
