public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public Order() {
        qtyOrdered = 0;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered != 10) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            return true;
        } else {
            System.out.println("The order is almost full");
            return false;
        }
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {

    }

    public float totalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc d : itemsOrdered) {
            totalCost += d.getCost();
        }
        return totalCost;
    }
}
