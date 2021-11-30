

public class Person implements Comparable<Person> {
    private String address;
    private String name;
    private int age;

    public Person() {}

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * dsadasdas.
     * @param name adsdas
     * @param age asddas
     * @param address adsdsa
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * return to String.
     */
    public String toString() {
        return "Person[name=" + this.getName() 
                + ",age=" + this.getAge() 
                + ",address=" + this.getAddress() + "]";
    }

    String check(String s) {
        int i = s.lastIndexOf(' ');
        return s.substring(i + 1, s.length());
    }

    @Override
    public int compareTo(Person other) {
        if (check(this.name).compareTo(check(other.getName())) == 0) {
            if (this.age > other.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
        if (check(this.name).compareTo(check(other.getName())) < 0) {
            return 1;
        } 
        return -1;
    }
}
