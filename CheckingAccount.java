public class CheckingAccount extends Account {
    private double balance;
    private String name;
    public CheckingAccount(double balance, String user, String key, String name) {
        super(user, key);
        this.name = name;
        this.balance = balance;
    }

    public void displayStats() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Balance: " + getBalance());
    }

    public void sendMoney(double amount, CheckingAccount target) {
        if (getBalance() >= amount) {
            target.addMoney(amount);
            takeMoney(amount);
        }
        else {
            System.out.println("Broke");
        }
    }
    public void sendMoney(double amount, SavingsAccount target) {
        if (getBalance() >= amount) {
            target.addMoney(amount);
            takeMoney(amount);
        }
        else {
            System.out.println("Broke");
        }
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
    public String getName() {
        return name;
    }
}
