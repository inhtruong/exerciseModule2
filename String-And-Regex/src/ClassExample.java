import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME = "^[CAP][0-9]{4}[GHIKLM]";

    public ClassExample() {
        this.pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {
            "C0318G",
            "M0318G",
            "P0323A"
    };

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classes : validClass) {
            boolean isClass = classExample.validate(classes);
            System.out.println("Class is " + classes + " is valid:" + isClass);
        }
    }
}
