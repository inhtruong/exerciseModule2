package TrackingAccount;

public class Mailer implements Observer{

    @Override
    public void update(User user) {
        if (LoginStatus.EXPIRED == user.getStatus()) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
