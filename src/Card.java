import java.util.Date;

public class Card {
    private String cardNumber;
    private Date expirationDate;
    private String cardHolderName;
    private Bank bank;

    public Card(String cardNumber, Date expirationDate, String cardHolderName, Bank bank) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardHolderName = cardHolderName;
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void getBank(){

    }


}
