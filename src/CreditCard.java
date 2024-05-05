public class CreditCard {

    private final double creditLimit =1000;
    private double balance ;

    public CreditCard(double balance) {
        setBalance(balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
