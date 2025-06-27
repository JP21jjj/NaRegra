package com.app.contratafut.Controler;

import com.app.contratafut.model.User;
import com.app.contratafut.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Controle {

    private final UserRepository repository;

    //essse construtor é usado para injetar a dependência do UserRepository
    //o @RequestMapping é usado para mapear requisições HTTP para métodos específicos
    public Controle(UserRepository repository) {
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

    //@PostMapping é usado para mapear requisições HTTP POST para métodos específicos

    @GetMapping("/goleiros")
    public List<User> listarGoleiros() {
        return repository.findByType("goleiro");
    }

    //@getMapping é usado para mapear requisições HTTP GET para métodos específicos

    @GetMapping("/juizes")
    public List<User> listarJuizes() {
        return repository.findByType("juiz");
    }

    //@getMapping é usado para mapear requisições HTTP GET para métodos específicos

    @GetMapping("/Jogadores")
    public List<User> listarjogadores(){
        return repository.findByType("jogador");
    }
    //@getMapping é usado para mapear requisições HTTP GET para métodos específicos

    @GetMapping("/{id}")
    public User obterUsuarioPorId(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
    //@pathVariable é usado para capturar o valor do id da URL


    @DeleteMapping("/{id}")
    public void deletarJogadores(@PathVariable String id) {
        repository.deleteById(id);
    }
}