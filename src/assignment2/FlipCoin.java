package assignment2;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        int heads = 0;
        int tails = 1;

        if (Math.random() < 0.5){
            return heads;
        }else{
            return tails;
        }
    }
}
