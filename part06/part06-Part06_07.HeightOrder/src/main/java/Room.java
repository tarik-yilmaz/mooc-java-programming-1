import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);

        for (Person p : persons) {
            if (shortest.getHeight() > p.getHeight()) {
                shortest = p;
            }
        }

        return shortest;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        
        persons.remove(shortest);

        return shortest;
    }





}
