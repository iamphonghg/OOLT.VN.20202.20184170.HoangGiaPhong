import java.time.LocalDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private int qtyOrdered;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    private MyDate dateOrdered;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];


    public Order() {
        qtyOrdered = 0;
        nbOrders++;
        dateOrdered = new MyDate();
        dateOrdered.setDate(LocalDate.now().toString());
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public MyDate getDateOrdered() {
        return dateOrdered;
    }
    public void setDateOrdered(MyDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered != 10) {
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The order is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if ((qtyOrdered + dvdList.length) >= 10) {
            System.out.println("The list of items cannot be added to the current order!");
        } else {
            for (DigitalVideoDisc digitalVideoDisc : dvdList) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
            }
            System.out.println("The list of items has been added to the current order!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if ((qtyOrdered + 2) >= 10) {
            System.out.println("The list of items cannot be added to the current order!");
        } else {
            itemsOrdered[qtyOrdered++] = dvd1;
            itemsOrdered[qtyOrdered++] = dvd2;
            System.out.println("The list of items has been added to the current order!");
        }
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc has been deleted.");
                return true;
            }
        }
        System.out.println("Not found disc!");
        return false;
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    public void printListItem() {
        System.out.println("***********************Order***********************");
        System.out.println("Date: " + dateOrdered.getDate());
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " +
                    itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
