public class Account {
    private static int ACCOUNTS = 2202000;
    private final int account_number;
    private int balance ;
    public String name;

    public Account(String name, int deposit){
        this.name = name;
        ACCOUNTS +=1;
        this.account_number = ACCOUNTS;
        this.deposit(deposit);

    }

    public Account(String name){
            this(name , 0);
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void displayAccount(){
        System.out.println("Account Name: "+ this.name);
        System.out.println("Account No. : "+ this.getAccount_number());
        System.out.println("Balance     : "+this.getBalance());
    }

    public void deposit(int deposit_amount) {
        if (deposit_amount>=0){
            this.balance += deposit_amount;
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public int withdraw(int withdraw_amount){
        if (this.balance>=withdraw_amount){
            this.balance -= withdraw_amount;
            return withdraw_amount;
        }
        else {
            System.out.println("Not enough balance to withdraw");
            return 0;
        }
    }
}
