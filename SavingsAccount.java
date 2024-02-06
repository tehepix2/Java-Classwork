public class SavingsAccount extends Account {
    private String name;
    private double interest;
    private double balance;
    public SavingsAccount(String user, String key, double balance, String name, double interest) {
        super(user, key);
        this.name = name;
        this.interest = interest;
        this.balance = balance;
    }

    public void displayStats() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest rate: " + interest + "%");
    }

    public void sendMoney(double amount, CheckingAccount target) {
        if (getBalance() >= amount) {
            target.addMoney(amount);
            takeMoney(amount);
        }
        else {
            System.out.println("Broke");
            lib.sleep(2000);
        }
    }

    public void interest() {
        double add = getBalance() * (interest / 100);
        addMoney(add);
    }
    public double getBalance() {
        return balance;
    }
    public void addMoney(double money) {
        balance += money;
    }
    public void takeMoney(double money) {
        balance -= money;
    }
}
