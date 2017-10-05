package MyDB;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
@NamedQuery(name = "Students.getAll", query = "SELECT c from students c")
public class ReadDB {





}
