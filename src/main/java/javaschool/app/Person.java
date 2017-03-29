package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Person extends Record {
    private String address;
    private final List<String> phones = new ArrayList<>();


    public String getAddress() {
    return address;
}

    public void setAddress(String address) {
        this.address = address;
    }



    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }


    @Override
    public String toString() {
        return getId() + " " + getName() + " " + phones + " " + getAddress();
    }
}