package fr.ece.debute.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Groupe {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String label;
    @ManyToMany()
    @JoinTable(
            name = "group_topic",
            joinColumns = @JoinColumn(name= "group_id"),
            inverseJoinColumns = @JoinColumn(name= "topic_id")
    )
    private List<Topic> topics;
}
