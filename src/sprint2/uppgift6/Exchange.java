package sprint2.uppgift6;

public class Exchange {
    public String getExchange(int input, int change){

        if(change < input){
            return "Du lämnade för lite pengar";
        } else if (change == input) {
            return "Det blev ingen växel";
        }

        input = change - input;

        int tusen = 0;
        int femHundra = 0;
        int tvaHundra = 0;
        int ettHundra = 0;
        int femtio = 0;
        int tjugo = 0;
        int tio = 0;
        int fem = 0;
        int tva = 0;
        int ett = 0;

        for (int i = 0; input > 0; i++) {
            if(input>=1000){
                tusen++;
                input-=1000;
            }
            if(input>=500 && input < 1000){
                femHundra++;
                input-=500;
            }
            if(input>=200 && input < 500){
                tvaHundra++;
                input-=200;
            }
            if(input>=100 && input < 200){
                ettHundra++;
                input-=100;
            }
            if(input>=50 && input < 100){
                femtio++;
                input-=50;
            }
            if(input>=20 && input < 50){
                tjugo++;
                input-=20;
            }
            if(input>=10 && input < 20){
                tio++;
                input-=10;
            }
            if(input>=5 && input < 10){
                fem++;
                input-=5;
            }
            if(input>=2 && input < 5){
                tva++;
                input-=2;
            }
            if(input>=1 && input < 2){
                ett++;
                input-=1;
            }
        }

        return "Tusen: "+tusen+"\nFemhundra: "+femHundra+"\nTvåhundra: "+tvaHundra+"\nHundra: "+ettHundra+"\nFemtio: "+femtio+"\nTjugo: "+tjugo+"\nTior: "+tio+
                "\nFemor: "+fem+"\nTvåor: "+tva+"\nEnkronor: "+ett;

    }
}
