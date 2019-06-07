package bankomat;

public class BankAccount {

    private double accountState, singleWithdrawLimit;
    private Person owner;

    public BankAccount(Person person, double accountState, double singleWithdrawLimit) {
        if (null == person) {
            throw new NullPointerException("Owner cannot be empty");
        }
        this.accountState = accountState;
        this.owner = person;
        this.singleWithdrawLimit = singleWithdrawLimit;
    }



    public void deposit(double money) {
        accountState += money;

    }

    public void withdraw(double money) {
        if (money > accountState) {
            throw new NotEnoughBalanceException();
        }
        if (money > singleWithdrawLimit) {
            throw new ZlotowaException();
        }
        accountState -= money;
    }

    public double getAccountState() {
        return accountState;
    }

    public void setAccountState(double accountState) {
        this.accountState = accountState;
    }

    public double getSingleWithdrawLimit() {
        return singleWithdrawLimit;
    }

    public void setSingleWithdrawLimit(double singleWithdrawLimit) {
        this.singleWithdrawLimit = singleWithdrawLimit;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountState=" + accountState +
                ", singleWithdrawLimit=" + singleWithdrawLimit +
                ", owner=" + owner +
                '}';
    }
}
