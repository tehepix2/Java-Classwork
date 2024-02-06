public class Account implements Lockable {
    
    private boolean isLocked = true;
    private String user;
    private String key;
   

    public Account(String user, String key) {
        this.user = user;
        this.key = key;
     
    }
    
    public void dashboard() {
       
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

    public void setKey(String key) {
        this.key = key;
        System.out.println("Your new password is: " + key);
    }

    public boolean access(String pass, String user) {
        if (pass.equals(this.key) && user.equals(this.user)) {
            unlock();
            return true;
        }
        else {
            System.out.println("Wrong password.");
            return false;
        }
    }
    public String getPass() {
        return key;
    }
    public String getUser() {
        return user;
    }
   
}