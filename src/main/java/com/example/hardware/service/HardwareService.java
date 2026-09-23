package com.example.hardware.service;

import com.example.hardware.dto.HardwareDTO;
import java.util.List;

public interface HardwareService {
    List<HardwareDTO> getAllHardware();
    HardwareDTO getHardwareByCode(String code);
}
