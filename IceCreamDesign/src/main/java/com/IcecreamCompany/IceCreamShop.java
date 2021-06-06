package com.IcecreamCompany;

import java.util.Objects;

public class IceCreamShop {

    private String cupConeType;
    private String flavor;
    private int numberOfScoops;
    private String size;
    private double priceOfScoop;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCupConeType() {
        return cupConeType;
    }

    public void setCupConeType(String cupConeType) {
        this.cupConeType = cupConeType;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public double getPriceOfScoop() {
        return priceOfScoop;
    }

    public void setPriceOfScoop(double priceOfScoop) {
        this.priceOfScoop = priceOfScoop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamShop that = (IceCreamShop) o;
        return numberOfScoops == that.numberOfScoops && Double.compare(that.priceOfScoop, priceOfScoop) == 0 && Objects.equals(size, that.size) && Objects.equals(cupConeType, that.cupConeType) && Objects.equals(flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, cupConeType, flavor, numberOfScoops, priceOfScoop);
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "size='" + size + '\'' +
                ", cupConeType='" + cupConeType + '\'' +
                ", flavor='" + flavor + '\'' +
                ", numberOfScoops=" + numberOfScoops +
                ", priceOfScoop=" + priceOfScoop +
                '}';
    }
}
