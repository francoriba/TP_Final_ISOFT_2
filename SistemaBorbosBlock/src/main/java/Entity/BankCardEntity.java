package Entity;

public class BankCardEntity {
    private int id;
    private String owner;
    private String number;
    private String secNumber;
    private String expirationDate;

    public BankCardEntity(String owner, String number, String secNumber, String expirationDate) {
        this.id = id;
        this.owner = owner;
        this.number = number;
        this.secNumber = secNumber;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecNumber() {
        return secNumber;
    }

    public void setSecNumber(String secNumber) {
        this.secNumber = secNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
