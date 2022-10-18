package sprint2.uppgift12;

public class Tåg extends Fordon implements Printable{
    int carts;

        public void detachCart(){
            carts -= 1;
    }
    public void addCart(){
            carts +=1;
    }
    public Tåg(int speed,int weigth, int carts) {
        super(speed, weigth);
        this.carts = carts;
    }



    public void printMe(){
        System.out.println("Vikt: "+weigth+" Hastighet: "+speed+" antal vagnar: "+carts);
    }
}
