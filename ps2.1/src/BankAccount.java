public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer;

    public BankAccount(){
        this.getAccnum();
        this.getBalance();
        this.getCustomer();
    }
    public BankAccount(String accnum,double balance,Person customer)
    {
        this.accnum = accnum;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccnum() {
        return accnum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account Number: "+accnum+ "\nBalance: "+balance+"\nAccount Holder: "+customer;
    }
}
