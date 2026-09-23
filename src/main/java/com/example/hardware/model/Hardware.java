package com.example.hardware.model;

public class Hardware {
    private String name;
    private String code;
    private double price;
    private HardwareType type;
    private int quantity;

    public Hardware() {}

    public Hardware(String name, String code, double price, HardwareType type, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public HardwareType getType() { return type; }
    public void setType(HardwareType type) { this.type = type; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
