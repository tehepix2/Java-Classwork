public interface Lockable {
    public void lock();
    public void unlock();
    public boolean locked();
    public void setKey(String key);
}
