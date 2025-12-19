public class Account {
    private int id;
    private static int idGen = 1;
    private Customer owner;
    private double balance;

    public Account(Customer owner, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.id = idGen++;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Mandatory object-parameter method
    public void apply(Transaction tx) {
        if (tx.getFrom() == this) {
            balance -= tx.getAmount();
        } else if (tx.getTo() == this) {
            balance += tx.getAmount();
        }
    }

    @Override
    public String toString() {
        return "Account{id=" + id +
                ", owner=" + owner.getName() +
                ", balance=" + balance + "}";
    }
}

