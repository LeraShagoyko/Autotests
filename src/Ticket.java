public class Ticket {
    public int id;
    public String question;

    public Ticket(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public String toString() {
        return "id" + id + " question" + question + "\n";
    }
}