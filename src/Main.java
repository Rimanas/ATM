public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(700_00, 1000_00, 500_00);
        System.out.println(atm.withdrawalBalanceAtm());
        System.out.println(atm.replenishmentBalanceAtm());
        System.out.println(atm.replenishmentBalanceAtm());
    }
}
