import org.testng.Assert;
import org.testng.annotations.Test;
import sprint2.uppgift9.Person;
import sprint2.uppgift9.PersonList;

import java.util.List;

public class TestPersonList {
    PersonList pl = new PersonList();
    Person p = new Person("Bert Bertilsson", "Gatan 3", "456234", 36, 75, 195);

    @Test
    public void getHeigthTest(){
        assert (p.getHeight() > 150 && p.getHeight() < 250);
        assert (p.getHeight() == 195);
    }

    @Test
    public void createPersonList(){
        List<Person> testList = pl.createPerson();
        assert(testList.get(2).getName().equals("Rulle Rullson"));
        assert(testList.get(2).getHeight() == 201);
        assert(testList.get(6).getName().equals("Ville Wilhemsson"));
        assert(testList.get(6).getHeight() == 187);
        assert(!testList.get(4).getName().equals("Sune Samuelsson"));
        assert(testList.get(4).getHeight() != 175);
    }

    @Test
    public void searchPersonList(){
        List<Person> tempList = pl.createPerson();
        List<Person> testList = pl.searchPerson(tempList);

        assert (testList.get(0).getName().equals("Rulle Rullson"));
        assert (testList.get(0).getHeight() >= 200);
        System.out.println(testList.size());
        assert (testList.size() <=2);
    }
}
