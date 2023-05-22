import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int MIN_AGE = 14;

    public static void main(String[] args) {
        List<Person> persons = createPersons();
        printAddressesForPersonAbove14Age(persons);
    }

    private static void printAddressesForPersonAbove14Age(List<Person> persons) {
        for (Person currentPerson : persons) {
            if (currentPerson != null && currentPerson.getAddress() != null && currentPerson.getAge() > MIN_AGE) {
                System.out.println("Person with age "
                        + currentPerson.getAge()
                        + " lives at "
                        + currentPerson.getAddress());
            }
        }
    }

    private static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }
        return persons;
    }
}