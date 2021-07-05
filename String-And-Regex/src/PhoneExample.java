import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";

    public PhoneExample() {
        this.pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class PhoneExampleTest {
    private static PhoneExample phoneExample;
    public static final String[] validAccount = new String[] {"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone : validAccount) {
            boolean isPhone = phoneExample.validate(phone);
            System.out.println("Phone is: " + phone + " is valid: " + isPhone);
        }
    }
}
