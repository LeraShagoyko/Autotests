public class Student {
    public String name;

    public String lastName;

    public int result;

    public Student(String name, String lastName, int result){
        this.name = name;
        this.lastName = lastName;
        this.result = result;
    }

    public String toString() {
        return "Name: " + name + " lastName " + lastName + " result " + result +"\n";
    }
}
