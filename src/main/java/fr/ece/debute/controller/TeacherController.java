package fr.ece.debute.controller;

import fr.ece.debute.entity.Student;
import fr.ece.debute.entity.Teacher;
import fr.ece.debute.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("teacher")
@RestController
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getTeachers() {
        return  teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getTeacher(@PathVariable UUID id) {
        return teacherRepository.findById(id);
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
