package sprint2.uppgift12;

public class Cykel extends Fordon implements Printable, Hjulburen{
    int numGears;
    int currentGear;

    int numWheel = 3;

    public void changeGear(int newGear){
        currentGear = newGear;
    }
    public Cykel(int speed,int weigth, int numGears, int currentGear) {
        super(speed, weigth);
        this.numGears = numGears;
        this.currentGear = currentGear;
    }



    public void printMe(){
        System.out.println("Vikt: "+weigth+" Hastighet: "+speed+" antal växlar: "+numGears+" nuvarande växel: "+currentGear);
    }

    public int getAntalHjul() {
        return numWheel;
    }
}
