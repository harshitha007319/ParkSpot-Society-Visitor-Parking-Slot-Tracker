package com.example.parkspot.controller;

import com.example.parkspot.entity.Visitor;
import com.example.parkspot.repository.VisitorRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
@CrossOrigin(origins = "*")
public class VisitorController {

    private final VisitorRepository repository;

    public VisitorController(VisitorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Visitor> getAllVisitors() {
        return repository.findAll();
    }

    @PostMapping
    public Visitor addVisitor(@RequestBody Visitor visitor) {
        return repository.save(visitor);
    }

    @PutMapping("/{id}")
    public Visitor updateVisitor(
            @PathVariable Long id,
            @RequestBody Visitor visitor) {

        Visitor existingVisitor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        existingVisitor.setName(visitor.getName());
        existingVisitor.setPhoneNumber(visitor.getPhoneNumber());
        existingVisitor.setVehicleNumber(visitor.getVehicleNumber());
        existingVisitor.setVehicleType(visitor.getVehicleType());

        return repository.save(existingVisitor);
    }

    @DeleteMapping("/{id}")
    public void deleteVisitor(@PathVariable Long id) {
        repository.deleteById(id);
    }
}