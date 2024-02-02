public class SavingsAccount extends Account {
    private String name;
    private double interest;
    public SavingsAccount(String user, String key, double balance, String name, double interest) {
        super(user, key, balance);
        this.name = name;
        this.interest = interest;
    }

    public void displayStats() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest rate: " + interest + "%");
    }

    public void sendMoney(double amount, Account target) {
        if (getBalance() >= amount) {
            target.addMoney(amount);
            takeMoney(amount);
        }
        else {
            System.out.println("Broke");
        }
    }

    public void interest() {
        double add = getBalance() * (interest / 100);
        addMoney(add);
    }
}
