package com.customersales.customerSales.entity;

public class Product {
    private Integer id;
    private String name;
    private String trademark;
    private Integer quantity;

    public Product(Integer id, String name, String trademark, Integer quantity) {
        this.id = id;
        this.name = name;
        this.trademark = trademark;
        this.quantity = quantity;
    }

    public Product(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
