package com.example.hardware.service;

import com.example.hardware.dto.HardwareDTO;
import com.example.hardware.model.Hardware;
import com.example.hardware.repository.HardwareRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService {

    private final HardwareRepository hardwareRepository;

    public HardwareServiceImpl(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @Override
    public List<HardwareDTO> getAllHardware() {
        return hardwareRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public HardwareDTO getHardwareByCode(String code) {
        Hardware hardware = hardwareRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException(
                        "Hardware s kodom " + code + " nije pronađen."));
        return convertToDTO(hardware);
    }

    private HardwareDTO convertToDTO(Hardware hardware) {
        return new HardwareDTO(
                hardware.getName(),
                hardware.getCode(),
                hardware.getPrice(),
                hardware.getType()
        );
    }
}
