package com.exampleMapstruct.demoMapstruct.controller;

import com.exampleMapstruct.demoMapstruct.dto.EmployeurDTO;
import com.exampleMapstruct.demoMapstruct.services.EmployeurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/employer")
@RequiredArgsConstructor
public class EmployeurController {

    private final EmployeurService personService;

    @PostMapping
    public ResponseEntity<EmployeurDTO> create(@RequestBody EmployeurDTO dto) {
        return ResponseEntity.ok(personService.createPerson(dto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeurDTO>> getAll() {
        return ResponseEntity.ok(personService.getAllPersons());
    }
}
