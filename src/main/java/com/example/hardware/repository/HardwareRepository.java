package com.example.hardware.repository;

import com.example.hardware.model.Hardware;
import java.util.List;
import java.util.Optional;

public interface HardwareRepository {
    List<Hardware> findAll();
    Optional<Hardware> findByCode(String code);
}
