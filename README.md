Lockable Interface

Design a Java interface called Lockable that includes the following methods: setKey, lock, unlock, and locked.  The setKey, lock, and unlock methods take an integer parameter that represents the key.  The setKey method establishes the key.  The lock and unlock methods lock and unlock the object, but only if the key used is correct.  The locked method returns a boolean of true for locked and false for unlocked.  If a lockable object is locked, its methods cannot be invoked; if it is unlocked, they can be invoked.  

Create an abstract superclass Account, and from that, a subclass CheckingAccount.  CheckingAccount should include methods to deposit, withdraw, and print the balance in the account.Make the CheckingAccount class lockable, as described above

Below, paste your code, sample trial runs, and a link to your code:
