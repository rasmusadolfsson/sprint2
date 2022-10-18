package sprint2.uppgift12;

public class Bil extends Fordon implements Printable, Hjulburen{
    int numGears;
    int currentGear;

    int numWheel = 4;

    public Bil(int speed,int weigth, int numGears, int currentGear) {
        super(speed, weigth);
        this.numGears = numGears;
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear){
        currentGear = newGear;
    }

    public void printMe() {
        System.out.println("Vikt: "+weigth+" Hastighet: "+speed+" antal växlar: "+numGears+" nuvarande växel: "+currentGear);
    }

    public int getAntalHjul() {
        return numWheel;
    }




/*
    public void printMe(){
        System.out.println("Vikt: "+weigth+" Hastighet: "+speed+" antal växlar: "+numGears+" nuvarande växel: "+currentGear);
    }

 */
}
