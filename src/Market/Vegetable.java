package Market;

import java.math.BigDecimal;
import java.util.Objects;

public class Vegetable {
    private String name;
    private BigDecimal price;

    private VegetableType type;

    private Integer units;

    public Vegetable(String name, BigDecimal price, VegetableType type, Integer units) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public VegetableType getType() {
        return type;
    }

    public void setType(VegetableType type) {
        this.type = type;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", units=" + units +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(name, vegetable.name) && Objects.equals(price, vegetable.price) && type == vegetable.type && Objects.equals(units, vegetable.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, units);
    }
}