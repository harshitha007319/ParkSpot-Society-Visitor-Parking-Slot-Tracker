package com.example.parkspot.controller;

import com.example.parkspot.entity.ParkingSlot;
import com.example.parkspot.repository.ParkingSlotRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking-slots")
@CrossOrigin(origins = "*")
public class ParkingSlotController {

    private final ParkingSlotRepository repository;

    public ParkingSlotController(ParkingSlotRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ParkingSlot> getAllSlots() {
        return repository.findAll();
    }

    @PostMapping
    public ParkingSlot addSlot(@RequestBody ParkingSlot parkingSlot) {
        return repository.save(parkingSlot);
    }

    @PutMapping("/{id}")
    public ParkingSlot updateSlot(
            @PathVariable Long id,
            @RequestBody ParkingSlot parkingSlot) {

        ParkingSlot existingSlot = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking slot not found"));

        existingSlot.setSlotNumber(parkingSlot.getSlotNumber());
        existingSlot.setAvailable(parkingSlot.getAvailable());

        return repository.save(existingSlot);
    }

    @DeleteMapping("/{id}")
    public void deleteSlot(@PathVariable Long id) {
        repository.deleteById(id);
    }
}