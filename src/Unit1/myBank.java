package Unit1;

public class myBank {
    public static void main(String[] args) {
        bank b=new bank();
        try{
            b.withdraw(5000);
            b.withdraw(150000);
        }catch (inSufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
