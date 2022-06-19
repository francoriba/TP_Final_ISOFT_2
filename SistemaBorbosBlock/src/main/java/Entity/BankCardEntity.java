package Entity;

public class BankCardEntity {
    private int id;
    private String entidad;
    private String number;
    private String secNumber;
    private String expirationDate;

    public BankCardEntity(String entidad, String number, String secNumber, String expirationDate) {
        this.id = id;
        this.entidad = entidad;
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

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
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
