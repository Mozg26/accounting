package com.accounting.accounting.dto;

import com.accounting.accounting.entity.Color;

public class ProductCheckAvailabilityDTO {
    String city;
    long partNumber;
    int size;
    Color color;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
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
}