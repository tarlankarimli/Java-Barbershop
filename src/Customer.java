import java.util.Date;

public class Customer extends Human {
    public Customer(String name, String surname, String email, String birthday, Integer phone) throws InfoException {
        super(name, surname, email, birthday, phone);
    }

}
