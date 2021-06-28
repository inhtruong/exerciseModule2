package MethodArrayLib;

public class MyListTest {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name: " + name +
                    ", age: " + age +
                    "}";
        }
    }

    public static void main(String[] args) {
        MyList<Person> myList = new MyList<>();
        MyList<Person> myList1 = new MyList<>(4);
        myList1.ensureCapacity(3);


        myList1.add(new Person("Dat",25));
        myList1.add(new Person("Son",18));
        myList1.add(new Person("Phuoc",27));

//        for(int i = 0; i < myList1.size(); i++) {
//            System.out.println(myList1.get(i));
//        }
    }
}
