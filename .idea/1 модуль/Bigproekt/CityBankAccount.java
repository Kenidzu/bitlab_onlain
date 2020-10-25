public class CityBankAccount implements BankAccount{
    private String name;
    private String surname;
    private int balance;
    private String acсountNamber;
    private String pinCode;

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, int balance, String acсountNamber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.acсountNamber = acсountNamber;
        this.pinCode = pinCode;
    }


    @Override
    public String getAccountNumber() {
        return acсountNamber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance = totalBalance() - credit;
    }

    @Override
    public void debetBalance(int debet) {
        balance = totalBalance() + debet;
    }

    @Override
    public String accountData() {
        return this.name + " " + this.surname + " " + this.balance + " " + this.acсountNamber;
    }

    @Override
    public String nameBank() {
        return "City";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAcсountNamber() {
        return acсountNamber;
    }

    public void setAcсountNamber(String acсountNamber) {
        this.acсountNamber = acсountNamber;
    }
}
