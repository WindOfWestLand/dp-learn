package pers.westwind.learn.decorator;

/**
 * Created by Administrator on 2017/3/12.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    private int size;

    public final static int TALL = 0;
    public final static int GRANDE = 1;
    public final static int VENTI = 2;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size > 2 || size < 0) {
            throw new RuntimeException("Error Size! Use Beverage.TALL, Beverage.GRANDE, Beverage.VENTI.");
        }
        this.size = size;
    }
}
