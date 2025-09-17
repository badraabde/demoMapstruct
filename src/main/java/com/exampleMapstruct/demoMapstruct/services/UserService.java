package com.exampleMapstruct.demoMapstruct.services;

import com.exampleMapstruct.demoMapstruct.dto.UserDTO;
import com.exampleMapstruct.demoMapstruct.mapper.UserMapper;
import com.exampleMapstruct.demoMapstruct.model.Order;
import com.exampleMapstruct.demoMapstruct.model.User;
import com.exampleMapstruct.demoMapstruct.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);

        // Relier chaque Order au User avant de sauvegarder
        if (user.getOrders() != null) {
            for (Order order : user.getOrders()) {
                order.setUser(user); // essentiel pour la relation N-1
                if (order.getProducts() == null) {
                    order.setProducts(new ArrayList<>()); // éviter les nulls pour ManyToMany
                }
            }
        }

        User savedUser = userRepository.save(user);
        System.out.println("User created successfully [dev1]: " + savedUser.getId());
        return userMapper.toDTO(savedUser);
    }

    public UserDTO updateUser(Long id, UserDTO updatedUserDTO) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setName(updatedUserDTO.getName());
                    existingUser.setEmail(updatedUserDTO.getEmail());
                    existingUser.setRole(updatedUserDTO.getRole());

                    // Optionally handle orders if needed
                    List<Order> updatedOrders = (updatedUserDTO.getOrders() != null) ?
                            updatedUserDTO.getOrders().stream()
                                    .map(orderDto -> {
                                        Order order = new Order();
                                        order.setId(orderDto.getId());
                                        order.setUser(existingUser);
                                        // Set other fields as necessary
                                        return order;
                                    })
                                    .collect(Collectors.toList())
                            : existingUser.getOrders();

                    existingUser.setOrders(updatedOrders);

                    User savedUser = userRepository.save(existingUser);
                    return userMapper.toDTO(savedUser);
                }).orElse(null);
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}