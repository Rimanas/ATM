public class ATM {
    private int balanceAtm;
    private int currentBalanceCard;
    private int receiptMoney;
    private int contributionMoney;
    public ATM(int currentBalanceCard, int balanceAtm, int receiptMoney, int contributionMoney) {
        this.currentBalanceCard = currentBalanceCard;
        this.balanceAtm = balanceAtm;
        this.receiptMoney = receiptMoney;
        this.contributionMoney = contributionMoney;

    }
    public int withdrawalBalanceCard() {
        if (receiptMoney > balanceAtm){
            return 0;
        }
        if (currentBalanceCard < receiptMoney){
            return 0;
        }
        if (currentBalanceCard >= receiptMoney) {
            currentBalanceCard = currentBalanceCard - receiptMoney;
            return currentBalanceCard;
        }

        return currentBalanceCard;=
    }

    public int replenishmentBalanceCard() {
        currentBalanceCard = currentBalanceCard + contributionMoney;
        return currentBalanceCard;
    }


}
