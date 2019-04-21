import java.util.List;

public class Group {
    public String name;
    public List<Student> students;

    public Group(String name, List<Student> students) {
        this.students = students;
        this.name = name;
    }
    public String toString() {
        return "Group Name: " + name + "\n";
    }
}