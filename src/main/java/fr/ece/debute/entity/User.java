package fr.ece.debute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.UUID;

@Entity
@Data
abstract public class User {
    @GeneratedValue
    @Id
    @Setter(AccessLevel.NONE)
    protected UUID id;
    protected String username;
    protected String password;
    protected String email;
    protected String firstName;
    protected String lastName;
}
