package app;


public class MerchantA extends Merchant implements Bonus {

    String email;

    public MerchantA(String firstName, String secondName, String phone, String email) {
        super(firstName, secondName, phone);
        this.email = email;
    }

    public String infoMerchant() {
        String firstName = getFirstName();
        String secondName = getSecondName();
        String phone = getPhone();
        return "\nMerchant: " + firstName +" "+secondName+", " + phone + ", " + email + "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else {
            return sales * 15 / 100;
        }
    }
}
