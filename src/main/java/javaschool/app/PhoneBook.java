package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public class PhoneBook {

    private List<Record> recordList = new ArrayList<>();

    @Command
    public void create(String name, String address, String... phones) {
        Record r = new Record();
        r.setName(name);
        r.addPhones(phones);
        r.setAddress(address);
        recordList.add(r);

    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {
            if (r.getId() == id) {
                r.addPhones(phone);
                break;
            }
        }
    }
    @Command
    public List<Record> find(String str){
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r: recordList){
            String name = r.getName() .toLowerCase();
            String addres = r.getAddress().toLowerCase();
            if(name.contains(str)||addres.contains(str)){
                result.add(r);
            }
        }
        return result;
    }


}
