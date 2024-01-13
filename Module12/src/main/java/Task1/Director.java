package Task1;

import java.util.Date;

public class Director {
    public int id;

    public String firstName;

    public String lastName;

    public Date birthDate;

    public String country;

    public Director(int id, String firstName, String lastName, Date birthDate, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.country = country;
    }
}
