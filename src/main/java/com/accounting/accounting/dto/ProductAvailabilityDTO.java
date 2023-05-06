package com.accounting.accounting.dto;
import com.accounting.accounting.entity.Color;
public class ProductAvailabilityDTO {

    private long partNumber;
    private String city;
    private String address;
    private int size;
    private Color color;
    private int count;

    public String getCity() {
        return city;
    }

    public long getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
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
}
