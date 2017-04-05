package javaschool.app;


public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getNote();
    }
}
