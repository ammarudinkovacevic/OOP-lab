package boxes;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private int currentWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    @Override
    public void add(Thing thing) {
        if (currentWeight + thing.getWeight() <= maxWeight) {
            currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return super.getThings().contains(thing);
    }


    public static void main(String[] args) {
        MaxWeightBox coffeBox = new MaxWeightBox(10);
        coffeBox.add(new Thing("Saludo", 5));
        coffeBox.add(new Thing("Pirkka", 5));
        coffeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(coffeBox.isInTheBox(new Thing("Pirkka", 5)));
        System.out.println(coffeBox.isInTheBox(new Thing("Kopi Luwak", 5)));
    }
}
