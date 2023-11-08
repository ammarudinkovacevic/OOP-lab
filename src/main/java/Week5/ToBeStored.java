package Week5;

import java.util.ArrayList;

public interface ToBeStored {
    double weight();
}

class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }
}

class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
}

class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(ToBeStored item) {
        if (item.weight() + totalWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public double totalWeight() {
        double weight = 0.0;
        for (ToBeStored item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + totalWeight() + " kg";
    }

    public static void main(String[] args) {
        Box box = new Box(10.0);
        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of The Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Randezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}