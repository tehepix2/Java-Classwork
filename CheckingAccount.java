public class CheckingAccount extends Account {
    
    private String name;
    public CheckingAccount(double balance, String user, String key, String name) {
        super(user, key, balance);
        this.name = name;
    }

    public void displayStats() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Balance: " + getBalance());
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
}
