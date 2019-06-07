package bankomat;

public class CashMachine {

    public static void main(String[] args) {
        Person p1 = new Person("Edek", "Sztacheta");
        BankAccount ba = new BankAccount(p1, 10000, 400);

        try {
            BankAccount ba1 = new BankAccount(null, 10000, 100);
        } catch (NullPointerException e) {
            System.out.println("towrzymy konto na słupa?");
        }

        try {
            ba.withdraw(500);
        } catch (ZlotowaException e) {
            System.out.println("mamy ZlotowaException");
        }
        try {
            ba.withdraw(10001);
        } catch (NotEnoughBalanceException e) {
            System.out.println("Za mało siana!!!");
        }

        for (int i = 0; i < 100; i++) {
            ba.withdraw(10 * i);
            System.out.println(ba.getAccountState());
        }

        System.out.println(ba);
    }

}
