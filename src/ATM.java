public class ATM {
    private int id;
    private String location;
    private Bank bank;

    public ATM(int id, String location, Bank bank) {
        this.id = id;
        this.location = location;
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void dispenseCash(){

    }
    public void depositCash(){

    }
    public void transferFunds(){

    }

}
