package com.example.hardware.dto;

import com.example.hardware.model.HardwareType;

public class HardwareDTO {
    private String name;
    private String code;
    private double price;
    private HardwareType type;

    public HardwareDTO() {}

    public HardwareDTO(String name, String code, double price, HardwareType type) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.type = type;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public HardwareType getType() { return type; }
    public void setType(HardwareType type) { this.type = type; }
}
