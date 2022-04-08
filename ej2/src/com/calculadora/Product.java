package com.calculadora;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private String clothes;
    private BigDecimal bigDecimal;
    private Tax normal;

    public Product(String clothes, BigDecimal bigDecimal, Tax normal) {
        this.clothes = clothes;
        this.bigDecimal = bigDecimal;
        this.normal = normal;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public Tax getNormal() {
        return normal;
    }

    public void setNormal(Tax normal) {
        this.normal = normal;
    }

    @Override
    public int compareTo(Product o) {
        int ordenado=this.clothes.compareTo(o.getClothes());
        return ordenado;
    }
}
