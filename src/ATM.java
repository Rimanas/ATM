public class ATM {
    private int currentBalanceAtm;
    private int receiptMoney;
    private int contributionMoney;
    public ATM(int currentBalanceAtm, int receiptMoney, int contributionMoney) {
        this.currentBalanceAtm = currentBalanceAtm;
        this.receiptMoney = receiptMoney;
        this.contributionMoney = contributionMoney;
    }
    public int withdrawalBalanceAtm() {
        if (receiptMoney > currentBalanceAtm){
            return 0;
        }
        if (currentBalanceAtm >= receiptMoney) {
            currentBalanceAtm = currentBalanceAtm - receiptMoney;
            return currentBalanceAtm;
        }
        return currentBalanceAtm;
    }

    public int replenishmentBalanceAtm() {
        currentBalanceAtm = currentBalanceAtm + contributionMoney;
        return currentBalanceAtm;
    }
}
