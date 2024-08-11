public class BankAccount {
    private int number;
    private String agency;
    private String customerName;
    private double balance;

    public BankAccount (int number, String agency, String customerNamen, double balance) {
        this.number = number;
        this.agency = agency;
        this.customerName = customerNamen;
        this.balance = balance;
    }

    public BankAccount(){};

    public void deposit (double value) {
        this.balance += value;
        System.out.println("Depósito realizado com sucesso");
    }
    public void withdraw (double value) {
        if (this.balance < value){
            System.out.println("Saldo insuficiente");
            System.out.println("-----------------");
            System.out.println("Seu saldo é de R$" + getBalance());
            System.out.println("-----------------");

        }else {
            this.balance -= value;
            System.out.println("Saque realizado com sucesso");
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
