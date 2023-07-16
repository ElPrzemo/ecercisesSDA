package Market;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String name;
    private String color;
    private BigDecimal price;
    private int numWheel;
    private int topSpeed;


    public Car(String name, String color, BigDecimal price, int numWheel, int topSpeed) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.numWheel = numWheel;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumWheel() {
        return numWheel;
    }

    public void setNumWheel(int numWheel) {
        this.numWheel = numWheel;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numWheel=" + numWheel +
                ", topSpeed=" + topSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numWheel == car.numWheel && topSpeed == car.topSpeed && Objects.equals(name, car.name) && Objects.equals(color, car.color) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, numWheel, topSpeed);
    }
}
