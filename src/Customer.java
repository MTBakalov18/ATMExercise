public class Customer {
    private String name;
    private String address;
    private String phone;
    private int accountNumber;
    private int pin;
    private Bank bank;

    public Customer(String name, String address, String phone, int accountNumber, int pin, Bank bank) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void checkBalance(){
        //checks
    }


}
