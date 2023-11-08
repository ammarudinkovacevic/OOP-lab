package boxes;
import java.util.ArrayList;
import java.util.Collection;
public abstract class Box {

    private Collection<Thing> things;

    public Box() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public abstract boolean isInTheBox(Thing thing);

    public Collection<Thing> getThings() {
        return things;
    }

    public static void main(String[] args) {
        Box box = new MaxWeightBox(10);
        if (box instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox = (MaxWeightBox) box;
        }

        box = new OneThingBox();
        if (box instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box;
        }

        box = new BlackHoleBox();
        if (box instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box;
        }

        Thing thing = new Thing("SomeThing", 5);
        if (thing instanceof Box) {
            Box someBox = (Box) thing;
        }
    }
}
