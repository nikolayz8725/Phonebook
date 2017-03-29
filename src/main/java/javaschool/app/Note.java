package javaschool.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String toString() {
        return getId() + " " + getName() + "" + getNote();
    }
}
