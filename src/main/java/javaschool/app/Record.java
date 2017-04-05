package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public abstract class Record {
    private static int count = 0;


    private int id;

    public int getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Record() {
        count++;
        id = count;
    }


}
