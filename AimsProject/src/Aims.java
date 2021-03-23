import java.util.Date;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King");
        dvd2.setCategory("Animation");
        dvd2.setCost(19.95f);
        dvd2.setDirector("Roger Allers");
        dvd2.setLength(87);

        DigitalVideoDisc[] dvdList = {dvd1, dvd2};
        anOrder.addDigitalVideoDisc(dvd1, dvd2);

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.printListItem();
    }
}
