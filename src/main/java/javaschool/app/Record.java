package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public class Record {
    private static int count = 0;


    private int id;

    public int getId() {
        return id;
    }

    private String name;

    private String address;
    private final List<String> phones = new ArrayList<>();

    public Record() {
        count++;
        id = count;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }


    @Override
    public String toString() {
        return id + " " + name + " " + phones + " " + address + " ---- " + count;
    }
}
