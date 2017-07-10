/**
 * Created by Moi on 10/07/2017.
 */
public class Main {

    public static void main(String[] args) {
        Eatable myLegume = new Legume();
        Eatable myMeat = new Meat();
        Bag myBag = new Bag();

        myBag.add(myLegume);
        myBag.add(myMeat);

    }
}
