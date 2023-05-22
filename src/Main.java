import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }
        for (Person currentPerson : persons) {
            if (currentPerson != null && currentPerson.getAddress() != null && currentPerson.getAge() > 14) {
                System.out.println("Person with age "
                        + currentPerson.getAge()
                        + " lives at "
                        + currentPerson.getAddress());
            }
        }

    }
}