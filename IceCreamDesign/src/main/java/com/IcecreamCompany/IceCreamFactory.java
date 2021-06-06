package com.IcecreamCompany;

import java.util.Objects;

public class IceCreamFactory {
    private String ingredient;
    private double containerSize;
    private String Freezer;
    private double totalIceCream;
    private int numberOfStores;

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(double containerSize) {
        this.containerSize = containerSize;
    }

    public String getFreezer() {
        return Freezer;
    }

    public void setFreezer(String freezer) {
        Freezer = freezer;
    }

    public double getTotalIceCream() {
        return totalIceCream;
    }

    public void setTotalIceCream(double totalIceCream) {
        this.totalIceCream = totalIceCream;
    }

    public int getNumberOfStores() {
        return numberOfStores;
    }

    public void setNumberOfStores(int numberOfStores) {
        this.numberOfStores = numberOfStores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Double.compare(that.containerSize, containerSize) == 0 && Double.compare(that.totalIceCream, totalIceCream) == 0 && numberOfStores == that.numberOfStores && Objects.equals(ingredient, that.ingredient) && Objects.equals(Freezer, that.Freezer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredient, containerSize, Freezer, totalIceCream, numberOfStores);
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "ingredient='" + ingredient + '\'' +
                ", containerSize=" + containerSize +
                ", Freezer='" + Freezer + '\'' +
                ", totalIceCream=" + totalIceCream +
                ", numberOfStores=" + numberOfStores +
                '}';
    }
}
