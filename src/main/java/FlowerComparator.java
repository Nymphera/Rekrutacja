import model.Flower;

import java.util.Comparator;

public class FlowerComparator implements Comparator<Flower> {


    @Override
    public int compare(Flower o1, Flower o2) {
        System.out.println(o1.getPrice().compareTo(o2.getPrice()));
        return !o1.getPrice().equals(o2.getPrice()) ? o1.getPrice().compareTo(o2.getPrice()) :
                !o1.getName().equals(o2.getName()) ? o1.getName().compareTo(o2.getName()) :
                        Integer.compare(o1.getDescription().length(), o2.getDescription().length());
    }
}
