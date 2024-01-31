public class Account implements Lockable {
    private int balance = 0;
    private boolean isLocked = true;
    private String user;
    private String pass;
    private String name;

    public Account(int balance, boolean isLocked, String user, String pass, String name) {
        this.balance = balance;
        this.isLocked = isLocked;
        this.user = user;
        this.pass = pass;
        this.name = name;
    }
    
    public void lock() {
        if (isLocked == false) {
            isLocked = true;
        }
        System.out.println("Locked.");
    }
    public void unlock() {
        if (isLocked) {
            isLocked = false;
        }
        System.out.println("Unlocked.");
    }
    public boolean locked() {
        return isLocked;
    }

    public void setKey(String pass) {
        this.pass = pass;
        System.out.println("Your new password is: " + pass);
    }

    @Override
    public void setKey() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setKey'");
    }



}