package fr.ece.debute.controller;

import fr.ece.debute.entity.Groupe;
import fr.ece.debute.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("group")
@RestController
public class GroupeController {
    @Autowired
    private GroupeRepository groupeRepository;

    @GetMapping
    public List<Groupe> getGroups() {
        return groupeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Groupe> getGroup(@PathVariable UUID id) {
        return groupeRepository.findById(id);
    }

    @PostMapping
    public Groupe addGroup(@RequestBody Groupe groupe) {
        return groupeRepository.save(groupe);
    }
}
