package com.example.demo_gradle;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepositorySupport userRepositorySupport;

    //@Transactional
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        userRepository.save(new User(name, email));

        return "Saved";
    }
    //@Transactional
    @RequestMapping(value="/find", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody List<User> getUser(@RequestParam String name) {
        // This returns a JSON or XML with the users
        return userRepository.findByName(name);
    }
}
