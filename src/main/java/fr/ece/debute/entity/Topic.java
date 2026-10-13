package fr.ece.debute.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Topic {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String label;

    @ManyToMany(mappedBy = "topics", cascade = CascadeType.PERSIST)
    private List<Teacher> teachers;

    @ManyToMany(mappedBy = "topics", cascade = CascadeType.PERSIST)
    private List<Groupe> groupes;
}
