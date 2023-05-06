package com.accounting.accounting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.accounting.accounting.entity.Color;

@Entity
public class Cloathes {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String city;
    private String address;
    private int size;
    private Color color;
    private int count;
    private double cost;

    public long getId() {
        return id;
    }

    public void setPartNumber(long partNumber) {
        this.id = partNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
