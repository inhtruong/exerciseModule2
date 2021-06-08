package Student;

import org.w3c.dom.ls.LSOutput;

public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Phuoc");
        st.setClasses("C0421k1");
        System.out.println(st.getName());
        System.out.println(st.getClasses());
    }
}
