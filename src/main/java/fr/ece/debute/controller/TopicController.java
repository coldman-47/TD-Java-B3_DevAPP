package fr.ece.debute.controller;

import fr.ece.debute.entity.Topic;
import fr.ece.debute.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("topic")
@RestController("topic")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Topic> getTopic(@PathVariable UUID id) {
        return topicRepository.findById(id);
    }

    @PostMapping
    public Topic addTopic(@RequestBody Topic topic) {
        return topicRepository.save(topic);
    }
}
