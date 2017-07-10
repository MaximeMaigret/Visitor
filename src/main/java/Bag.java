import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moi on 10/07/2017.
 */
public class Bag implements IVisitor {

    List<Eatable> content = new ArrayList<>();

    @Override
    public void visit(Meat meat) {

    }

    @Override
    public void visit(Legume legume) {
        content.add(legume);
    }

    public void add(Eatable food){
        food.accept(this);
    }

    public boolean contains(Eatable food){
        return content.contains(food);
    }

}
