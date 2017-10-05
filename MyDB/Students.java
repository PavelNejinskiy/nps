package MyDB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "students")
public class Students implements Serializable {


    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name= "Name", length=255)
    private String Name;

    @Column(name= "lastName", length=255)
    private String lastName;

    public Students(String Name, String lastName) {
        this.Name = Name;
        this.lastName = lastName;
    }

    public Students() {
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}