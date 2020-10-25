public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }


    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCodee) {
        pinCode = pinCodee;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance = totalBalance() - credit - 200;
    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return null;
    }

    @Override
    public String nameBank() {
        return "National";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
