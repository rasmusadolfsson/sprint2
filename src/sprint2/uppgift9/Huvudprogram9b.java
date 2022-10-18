package sprint2.uppgift9;

import java.util.List;

public class Huvudprogram9b {

    Huvudprogram9b(){
        PersonList pl = new PersonList();
        List<Person> p = pl.createPerson();
        List<Person> tallPerson = pl.searchPerson(p);
        pl.writeList(tallPerson);

    }
    public static void main(String[] args) {
        Huvudprogram9b h = new Huvudprogram9b();

    }
}
