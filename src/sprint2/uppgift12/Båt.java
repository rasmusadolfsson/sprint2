package sprint2.uppgift12;

public class Båt extends Fordon implements Printable{
    int deadWeigth;

    public void turn(){

    }
    public Båt(int speed,int weigth, int deadWeigth) {
        super(speed, weigth);
        this.deadWeigth = deadWeigth;
    }


    public void printMe(){
        System.out.println("Vikt: "+weigth+" Hastighet: "+speed+" dödvikt: "+deadWeigth);
    }
}
