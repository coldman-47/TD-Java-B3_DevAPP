package fr.ece.debute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Student extends User {
    @ManyToOne
    private Groupe groupe;
}

/*
À créer
Entity
    Teacher
    Topic

 À associer
     teacher-topic
     group-topic
 */
