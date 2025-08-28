public class bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new inSufficientBalanceException("Not enough balance.");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal successfully, remaining balance "+ balance);
        }
    }
}
