public class BankAccount {
    private String ownerName;
    private int accNumber;
    private int balance = 0;
    

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println(getBalance());
    }

    public BankAccount(String ownerName, int accNumber) {
        this.ownerName = ownerName;
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void depositMoney(int amount) {
        balance+=amount;
    }   
    
    public void withdrawMoney(int amount) {
        if ((amount<=balance) && (amount<=500)){
        balance-=amount; }
        else if (amount>500){
            System.out.println("Too much at one time");
        } else {
            System.out.println("Don't enough money on your account");
        }
    }   

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alinka Chipolinka", 04112003);
        b1.depositMoney(500000);
        b1.showBalance();
        b1.withdrawMoney(500);
        b1.showBalance();
        b1.withdrawMoney(7000);
    }

}