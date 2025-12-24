import java.util.ArrayList;
import java.util.List;

public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public boolean matches(String match) {
        if (match == null)  {
            return false;
        }

        return this.name.toLowerCase().equals(match.toLowerCase());
    }


    public void observed() {
        this.observations++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }




}
