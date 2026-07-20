
class Bankaccount {
    private String Username;
    private int Password;
    private int CustomerdID;

    void setUsername(String Username) {
        this.Username = Username;
    }

    String getUsername() {
        return this.Username;
    }

    void setPassword(int Password) {
        this.Password = Password;
    }

    int getPassword() {
        return this.Password;
    }

    void setCustomerID(int CustomerID) {
        this.CustomerdID = CustomerID;
    }

    int getCustomerID() {
        return this.CustomerdID;
    }

}

public class Getter_setter {
    public static void main(String args[]) {

        Bankaccount cust1 = new Bankaccount();
        cust1.setCustomerID(1100234);
        cust1.setUsername("Piyushraghav994");
        cust1.setPassword(2384832);

        System.out.print("UserID :-" + cust1.getCustomerID() + " \nUsername :-" + cust1.getUsername() + " \nPassword :-"
                + cust1.getPassword());

    }
}
