package MyDB;

import javax.persistence.*;

@Entity
@Table(name = "Academicsubjects")
public class Academicsubjects {

    @Id
    @Column(name = "students_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer students_id;

    @Column(name = "mathematic", length = 255)
    private String mathematic;

    @Column(name = "physics", length = 255)
    private String physics;

    @Column(name = "philosophy", length = 255)
    private String philosophy;

    @Column(name = "programming", length = 255)
    private String programming;

    public Academicsubjects(String mathematic, String physics, String philosophy, String programming) {
        this.mathematic = mathematic;
        this.physics = physics;
        this.philosophy = philosophy;
        this.programming = programming;
    }
    public Academicsubjects() {}

    public void setStudents_id(Integer students_id) {
        this.students_id = students_id;
    }

    public void setMathematic(String mathematic) {
        this.mathematic = mathematic;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public void setPhilosophy(String philosophy) {
        this.philosophy = philosophy;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Integer getStudents_id() {
        return students_id;
    }

    public String getMathematic() {
        return mathematic;
    }

    public String getPhysics() {
        return physics;
    }

    public String getPhilosophy() {
        return philosophy;
    }

    public String getProgramming() {
        return programming;
    }
}
