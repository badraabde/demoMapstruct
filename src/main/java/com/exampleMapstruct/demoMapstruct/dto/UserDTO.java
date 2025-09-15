package com.exampleMapstruct.demoMapstruct.dto;

import com.exampleMapstruct.demoMapstruct.model.Adresse;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
        private Long id;
        private String name;
        private String email;
        private String role;

        private String image;        // Enum sous forme de String
        private String contenu;      // Texte long (ok pour JSON)
        private String fichierUrl;   // URL pour télécharger le fichier

        private Adresse adresse;  // DTO imbriqué
        private List<OrderDTO> orders;

}