import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, option;
        String agency, customerName;
        double balance = 0.0;


        System.out.println("\n=== Sistema Bancario ===");
        System.out.print("Nome: ");
        customerName = scanner.nextLine();

        System.out.print("Agencia (exemplo: 158-9): ");
        agency = scanner.nextLine();

        System.out.print("Numero da conta: ");
        number = scanner.nextInt();

        BankAccount account1 = new BankAccount(number, agency, customerName, balance);

        String menssage = "Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta "+ number + " e seu saldo " + balance + " já está disponível para saque";
        System.out.println(menssage);



        do {
            System.out.println("\n=== Sistema Bancario ===");
            System.out.println("1. Depósitar");
            System.out.println("2. Sacar");
            System.out.println("3. Mostrar saldo");
            System.out.println("0. Sair ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Qual o valor do depósito");
                    System.out.print("R$");
                    double value = scanner.nextDouble();
                    account1.deposit(value);

                    break;
                case 2:
                    System.out.println("Qual o valor do Saque");;
                    System.out.print("R$");
                    value = scanner.nextDouble();
                    account1.withdraw(value);
                    break;

                case 3:
                    System.out.println("Seu saldo");
                    System.out.println("-----------------");
                    System.out.print("R$");
                    System.out.println(account1.getBalance());
                    System.out.println("-----------------");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (option != 0);
    }
}
