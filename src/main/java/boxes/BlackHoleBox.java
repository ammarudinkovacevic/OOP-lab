package boxes;

public class BlackHoleBox extends Box {
    @Override
    public void add(Thing thing) {
        // Adding things to a black hole box, but they won't be found
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    public static void main(String[] args) {
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));

    }
}
