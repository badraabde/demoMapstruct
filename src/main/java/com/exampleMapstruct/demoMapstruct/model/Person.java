package com.exampleMapstruct.demoMapstruct.model;

import lombok.Data;

import javax.persistence.Embedded;
import java.util.Objects;

@Data
public class Person {

    private int age;
    private String nom;
    private String prenom;

    @Embedded
    private Adresse adresse;

    Person(int age, String nom, String prenom) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return age == other.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person(0, "Alice", "Pat");
        Person p2 = new Person(30, "Alice", "Pat");
        Person p3 = new Person(30, "Alex", "Alexdri");

        if (Objects.equals(p2, p3)) {
            System.out.println("identique");
        } else {
            System.out.println("non identique");
        }
    }
}
/*

Question 1 :
Lis le code fourni et explique son fonctionnement : la classe, ses attributs, le constructeur,
la méthode equals redéfinie et la logique dans la méthode main.

Question 2 :
À quoi correspond cette classe côté métier ?
Explique le rôle de la classe Person dans le contexte métier et comment elle représente une entité dans l’application.

Question 3 :
Explication de la méthode equals ,Explique le fonctionnement de la méthode redéfinie :
@Override public boolean equals(Object obj) et indique ce qu’elle retourne si obj est :un objet Person un objet d’un autre type ou null.

Question 4 :
Quel est l’output du programme ?
Donne le résultat affiché par la méthode main lorsque p2 et p3 sont comparés avec Objects.equals.

Question 5 :
Le code est-il compilable ?Le code compile-t-il tel quel ? Si non, identifie les erreurs et propose une version corrigée.

Question 6 :
Pourquoi utiliser Objects.equals(p2, p3) au lieu de p2.equals(p3) ?
Explique la différence entre ces deux approches et les avantages de Objects.equals, notamment pour gérer les objets null.

Question 7 :
Peut-on accéder directement à l’attribut age dans la méthode equals même s’il est private ?
Justifie pourquoi l’accès direct est autorisé et si l’utilisation de getAge() est nécessaire dans ce contexte.
*/



