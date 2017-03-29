package javaschool.app;

import asg.cliche.Command;
import com.sun.jndi.cosnaming.IiopUrl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public class PhoneBook {

    private List<Record> recordList = new ArrayList<>();

    @Command
    public void createPerson(String name, String address, String... phones) {
        Person r = new Person();
        r.setName(name);
        r.addPhones(phones);
        r.setAddress(address);
        recordList.add(r);

    }

    @Command
    public void createNote(String note) {

        Note r = new Note();

        r.setNote(note);

        recordList.add(r);
    }


    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {
            if (r instanceof Person && r.getId() == id) {
                Person p = (Person) r;
                p.addPhones(phone);
                break;
            }
        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList) {

            String name = r.getName().toLowerCase();

            String note;
            if (r instanceof Note) {
               Note p = (Note) r;
                note = p.getNote().toLowerCase();
            } else {
                note = "";
            }

            String address;
            if (r instanceof Person) {
                Person p = (Person) r;
                address = p.getAddress().toLowerCase();
            } else {
                address = "";
            }


            if (name.contains(str) || address.contains(str)||note.contains(str)) {
                result.add(r);
            }
        }
        return result;
    }


}
