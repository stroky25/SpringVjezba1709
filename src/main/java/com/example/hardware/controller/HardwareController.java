package com.example.hardware.controller;

import com.example.hardware.dto.HardwareDTO;
import com.example.hardware.service.HardwareService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hardware")
public class HardwareController {

    private final HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @GetMapping
    public ResponseEntity<List<HardwareDTO>> getAllHardware() {
        return ResponseEntity.ok(hardwareService.getAllHardware());
    }

    @GetMapping("/{code}")
    public ResponseEntity<HardwareDTO> getHardwareByCode(@PathVariable String code) {
        return ResponseEntity.ok(hardwareService.getHardwareByCode(code));
    }
}
