package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;


public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    private MyDate dateOrdered;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();



    public Order() {
        nbOrders++;
    }

    public void addMedia() {

    }

    public void removeMedia() {

    }

    public MyDate getDateOrdered() {
        return dateOrdered;
    }
    public void setDateOrdered(MyDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }






}
