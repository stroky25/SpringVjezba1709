package com.example.hardware.repository;

import com.example.hardware.model.Hardware;
import com.example.hardware.model.HardwareType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HardwareRepositoryImpl implements HardwareRepository {

    private final List<Hardware> hardwareList = new ArrayList<>();

    public HardwareRepositoryImpl() {
        hardwareList.add(new Hardware("Intel Core i5-14600K", "CPU001", 299.99, HardwareType.CPU, 10));
        hardwareList.add(new Hardware("NVIDIA GeForce RTX 4070", "GPU001", 599.99, HardwareType.GPU, 5));
        hardwareList.add(new Hardware("ASUS TUF Gaming B760", "MBO001", 179.99, HardwareType.MBO, 7));
        hardwareList.add(new Hardware("Kingston Fury 16GB DDR5", "RAM001", 69.99, HardwareType.RAM, 20));
        hardwareList.add(new Hardware("Samsung 990 PRO 1TB", "SSD001", 99.99, HardwareType.STORAGE, 15));
        hardwareList.add(new Hardware("NZXT Gaming Case", "OTH001", 89.99, HardwareType.OTHER, 8));
    }

    @Override
    public List<Hardware> findAll() {
        return hardwareList;
    }

    @Override
    public Optional<Hardware> findByCode(String code) {
        return hardwareList.stream()
                .filter(h -> h.getCode().equalsIgnoreCase(code))
                .findFirst();
    }
}
