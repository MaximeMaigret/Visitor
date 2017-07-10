/**
 * Created by Moi on 10/07/2017.
 */
public class Meat extends Eatable {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
