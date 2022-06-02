package app;

// Модель объекта Продавца.
public class Merchant {

    private final String firstName;
    private final String secondName;
    private final String phone;

    public Merchant(String firstName, String secondName, String phone) {
        this.firstName = firstName;
        this.secondName= secondName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }
}
