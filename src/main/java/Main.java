import model.Flower;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Flower[] flowers = new Flower[5];

        flowers[0] = new Flower("Agapanthus", "Knows as a flowe of love. It has " +
                "spectacular funnel-shaped florets in a round cluster.", new BigDecimal("42"));
        flowers[1] = new Flower("Gerbera", "The Gerbera daisy legend says that the daisy originated from a " +
                "nymph who transformed herself into a harming but unassuming wildflower to escape unwanted attention.",
                new BigDecimal("4.08"));
        flowers[2] = new Flower("Poinsettias", "One of the most popular plants over the Christmas",
                new BigDecimal("20.01"));
        flowers[3] = new Flower("Campanuas", "The genus includes nearly 300 species from daintly miniatures to" +
                " stalwart uprights.", new BigDecimal("20.01"));
        flowers[4] = new Flower("Violet", "Cultivated for thousand of years, they are usedfor eating and medicine",
                new BigDecimal("4.16"));

        FlowerComparator flowerComparator = new FlowerComparator();
        Flower[] flowersSorted = Arrays.stream(flowers).sorted(flowerComparator).toArray(Flower[]::new);

    }
}
