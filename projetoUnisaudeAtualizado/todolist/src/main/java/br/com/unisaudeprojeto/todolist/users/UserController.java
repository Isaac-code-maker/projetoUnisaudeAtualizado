package br.com.unisaudeprojeto.todolist.users;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping
    public List<UserModel> findAll() {
        List<UserModel> result = userRepository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public UserModel findById(@PathVariable UUID Id) {
        UserModel result = userRepository.findById(Id).get();
        return result;
    }

    @PostMapping
    public UserModel insert(@RequestBody UserModel userModel) {
        UserModel result = userRepository.save(userModel);
        return result;
    }
}
    

