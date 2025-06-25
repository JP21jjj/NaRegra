package com.app.contratafut.Controler;

import com.app.contratafut.model.User;
import com.app.contratafut.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Controler {

    private final UserRepository repository;

    public Controler(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> listarUsuarios() {
    return repository.findAll();
}

    @PostMapping
    public User criarUsuario(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/goleiros")
    public List<User> listarGoleiros() {
        return repository.findByType("goleiro");
    }

    @GetMapping("/juizes")
    public List<User> listarJuizes() {
        return repository.findByType("juiz");
    }
}