package fi.vamk.tka.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController{
    @Autowired
    private UserRepository repository;

    //methods return all users from database
    @RequestMapping("/users")
    public Iterable<User> users(){
        return repository.findAll();
    }

}