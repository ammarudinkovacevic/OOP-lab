package boxes;

public class OneThingBox extends Box {
    private boolean containsThing;

    public OneThingBox() {
        containsThing = false;
    }

    @Override
    public void add(Thing thing) {
        if (!containsThing) {
            super.add(thing);
            containsThing = true;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    public static void main(String[] args) {
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));

    }
}
