public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(700_00);
        int withdrawal = atm.withdrawalBalanceAtm(10_000_00);
        int replenishment = atm.replenishmentBalanceAtm(500_000_00);
        System.out.println("Снятие денег с банкомата");
        System.out.println(withdrawal);
        System.out.println("Пополнение деньгами банкомата");
        System.out.println(replenishment);
    }
}
