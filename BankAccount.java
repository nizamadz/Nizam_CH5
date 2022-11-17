public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123,50,"Nizam","nizam@email.com",123456);
        System.out.println(account.deposit(8));
        System.out.println("saldo sekarang "+account.getBalance());
        System.out.println(account.withdraw(80));
        System.out.println(account.withdraw(5));
        System.out.println("saldo sekarang "+account.getBalance());
    }
}

public class BankAccount {
    private int accountNumber,balance,customerPhone;
    private String customerName,customerEmail;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public BankAccount(int accountNumber, int balance, String customerName,String customerEmail, int customerPhone){
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhone=customerPhone;
    }

    public String deposit(int money){
       this.balance+=money;
       return "Deposit Sukses";
    }

    public String withdraw(int money){
        if (money>this.balance){
            return "Saldo tidak mencukupi";
        }else {
            this.balance-=money;
            return "Withdraw Sukses";
        }
    }
}
