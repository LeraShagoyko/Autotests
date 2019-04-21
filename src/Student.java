public class Student {
    public String name;

    public String lastName;
    public int result;
    public Ticket ticket;

    public Student(String name, String lastName, int result, Ticket ticket){
        this.name = name;
        this.lastName = lastName;
        this.result = result;
        this.ticket = ticket;
    }
    public String toString() {
        return "Name: " + name + " lastName " + lastName + " ticket" + ticket + " result " + result +"\n";
    }
}
