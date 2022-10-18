package sprint2.inlämning2;

public class GymClient {
    protected String name;
    protected long PersonNumber;
    protected String membershipDate;

    public String getName() {
        return name;
    }

    public long getPersonNumber() {
        return PersonNumber;
    }

    public String getMembershipDate() {
        return membershipDate;
    }

    public GymClient(String name, long personNumber, String membershipDate) {
        this.name = name;
        PersonNumber = personNumber;
        this.membershipDate = membershipDate;
    }
}