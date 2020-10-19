public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(700_00, 500_00, 500_00, 1_000_00);
        System.out.println(atm.withdrawalBalanceCard());
        System.out.println(atm.replenishmentBalanceCard());
        System.out.println(atm.replenishmentBalanceCard());
    }
}
