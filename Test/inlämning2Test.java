import org.testng.Assert;
import org.testng.annotations.Test;
import sprint2.inlämning2.GymClient;
import sprint2.inlämning2.MembershipMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.testng.AssertJUnit.assertFalse;

public class inlämning2Test {

    MembershipMethods t = new MembershipMethods();
    List<GymClient> pl = t.createListOfClients();

    @Test  //Testar att personerna ligger i rätt ordning.
    public void createListOfClientsTest(){
        Assert.assertEquals(pl.get(3).getName().trim(), "Diamanda Djedi");
        assert (pl.get(3).getName().trim().equals("Diamanda Djedi"));
        assert (pl.get(2).getPersonNumber() == 8512021234L);
        assert (!pl.get(5).getName().trim().equals("Chamade Coriola"));
        assertFalse (pl.get(6).getPersonNumber() == 8512021234L);
    }

    @Test //Testar om medlemskapet är aktivt.
    public void checkMembershipDateTest(){
        Assert.assertTrue(t.checkMembershipDate(true ,pl.get(0).getMembershipDate()));
        Assert.assertFalse(t.checkMembershipDate(true, pl.get(12).getMembershipDate()));
        Assert.assertTrue(t.checkMembershipDate(true, pl.get(3).getMembershipDate()));
        Assert.assertFalse(t.checkMembershipDate(true, pl.get(5).getMembershipDate()));
    }

    @Test
    public void lastTrainedWriterTest(){
        t.lastTrained(false, pl.get(1));
    }

    @Test   //Testar så att inte vem som helst är medlem.
    public void personIsMemberTest(){
        assert (t.personIsMember(pl, "Alhambra Aromes"));
        assert (t.personIsMember(pl, "7703021234"));
        assert (!t.personIsMember(pl, "Hilmer Heur"));
        assert (!t.personIsMember(pl, "5711121234"));
    }

    @Test //Testar så att namn inte innehåller siffror och personnummer inte innehåller bokstäver.
    public void checkNameNumberValidTest(){
        assert (t.checkNameValid("Kalle Kalle "));
        assert (t.checkNumberValid("564456456"));
        assert (!t.checkNameValid("Micke55"));
        assert (!t.checkNumberValid("123123awda"));
    }

    @Test   //Läser in utskrift och jämför så den är rätt.
    public void printerTest(){
        Path readPath = Paths.get("src/sprint2/inlämning2/träningsschema.txt");

        t.lastTrained(false, pl.get(0));
        String output = pl.get(0).getPersonNumber()+", "+pl.get(0).getName()+", "+LocalDate.now();

        try(BufferedReader br = Files.newBufferedReader(readPath)){
            String compare = br.readLine();
            System.out.println(output);
            System.out.println(compare);
            assert (output.equals(compare));

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    @Test   //Testar att fel namn inte finns på listan.
    public void personIsOnListTest(){
        assert (!t.personIsOldMember(pl, "Björne"));
        assert (!t.personIsOldMember(pl, "546456456"));
    }

    @Test   //Matar in random personer från listan och kollar om de är medlemmar eller inte.
    public void loopTest(){
        String input = "";
        int counter = 0;
        int randomNum = 0;
        while(counter < 200){
            randomNum = ThreadLocalRandom.current().nextInt(0, pl.size());
            input = pl.get(randomNum).getName();
            if(randomNum == 0 ||randomNum == 3 ||randomNum == 4 ||randomNum == 6 ||randomNum == 13){
                assert (t.loopTest(input));
            }
            else assert (!t.loopTest(input));
            counter++;
        }
    }
}
