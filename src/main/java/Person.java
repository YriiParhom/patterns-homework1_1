import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }

    @Override
    public String toString() {
        return "Person: \n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Address: " + address + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
