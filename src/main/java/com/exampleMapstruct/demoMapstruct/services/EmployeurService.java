package com.exampleMapstruct.demoMapstruct.services;

import com.exampleMapstruct.demoMapstruct.dto.EmployeurDTO;
import com.exampleMapstruct.demoMapstruct.mapper.EmployeurMapper;
import com.exampleMapstruct.demoMapstruct.mapper.UserMapper;
import com.exampleMapstruct.demoMapstruct.model.Employeur;
import com.exampleMapstruct.demoMapstruct.repository.EmployeurRepository;
import com.exampleMapstruct.demoMapstruct.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

    @Service
    @RequiredArgsConstructor
    public class EmployeurService {

        private final EmployeurRepository personRepository;
        private final EmployeurMapper personMapper;
        private final PasswordEncoder passwordEncoder;

        public EmployeurDTO createPerson(EmployeurDTO createDTO) {
            Employeur person = personMapper.toEntity(createDTO);
       //    person.setPassword(passwordEncoder.encode(createDTO.getPassword())); // encoder le password
            Employeur saved = personRepository.save(person);
            return personMapper.toDTO(saved);
        }

        public List<EmployeurDTO> getAllPersons() {
            return personRepository.findAll()
                    .stream()
                    .map(personMapper::toDTO)
                    .collect(Collectors.toList());
        }
    }
