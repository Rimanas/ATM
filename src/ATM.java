public class ATM {
    private int currentBalanceAtm;
    public ATM(int currentBalanceAtm) {
        this.currentBalanceAtm = currentBalanceAtm;
    }
    public int withdrawalBalanceAtm(int receiptMoney) {
        if (receiptMoney > currentBalanceAtm){
            return 0;
        }
        if (currentBalanceAtm >= receiptMoney) {
            currentBalanceAtm = currentBalanceAtm - receiptMoney;
            return currentBalanceAtm;
        }
        return currentBalanceAtm;
    }
    public int replenishmentBalanceAtm(int contributionMoney) {
        currentBalanceAtm = currentBalanceAtm + contributionMoney;
        return currentBalanceAtm;
    }
}
